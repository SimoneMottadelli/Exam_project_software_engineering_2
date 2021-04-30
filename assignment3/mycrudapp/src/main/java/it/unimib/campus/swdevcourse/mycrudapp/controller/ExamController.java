package it.unimib.campus.swdevcourse.mycrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.unimib.campus.swdevcourse.mycrudapp.exception.DomainConstraintViolationException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.EmptyFieldException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceAlreadyExistsException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceNotFoundException;
import it.unimib.campus.swdevcourse.mycrudapp.model.Course;
import it.unimib.campus.swdevcourse.mycrudapp.model.Exam;
import it.unimib.campus.swdevcourse.mycrudapp.model.ExamKeys;
import it.unimib.campus.swdevcourse.mycrudapp.model.Person;
import it.unimib.campus.swdevcourse.mycrudapp.model.Student;
import it.unimib.campus.swdevcourse.mycrudapp.repository.CourseRepository;
import it.unimib.campus.swdevcourse.mycrudapp.repository.ExamRepository;
import it.unimib.campus.swdevcourse.mycrudapp.repository.PersonRepository;

@Controller
@RequestMapping(path = "/exams")
public class ExamController {
	
	@Autowired
	ExamRepository examRepository;
	@Autowired
	PersonRepository personRepository;
	@Autowired
	CourseRepository courseRepository;

	@GetMapping("/") // Maps GET requests
	public ModelAndView getExams() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Exam> exams = examRepository.findAll();
		modelAndView.addObject("exams", exams);
		modelAndView.setViewName("exams");
		return modelAndView;
	}

	@PostMapping(path = "/add/") // Map POST requests
	public ModelAndView addExam(@RequestParam Long studentId, @RequestParam Long courseId,
			@RequestParam Byte evaluation) {
		
		if (studentId == null)
			throw new EmptyFieldException("student_id");
		if (courseId == null)
			throw new EmptyFieldException("course_id");
		if (examRepository.existsById(new ExamKeys(studentId, courseId)))
			throw new ResourceAlreadyExistsException("Exam", "id", studentId + " and " + courseId);
		if (evaluation == null)
			throw new EmptyFieldException("evaluation");
		if (evaluation < 18 || evaluation > 31)
			throw new DomainConstraintViolationException("evaluation", "between 18 and 31");
		
		Person person = personRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "id", studentId));
		
		if (!(person instanceof Student)) 
			throw new ResourceNotFoundException("Student", "id", studentId);
		
		Course course = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course", "id", courseId));
		
		Exam exam = new Exam((Student) person, course, evaluation);
		examRepository.saveAndFlush(exam);
		return getExams();
	}

	@GetMapping("/student/{student_id}/course/{course_id}") // Maps GET requests
	public ModelAndView getExam(@PathVariable(value = "student_id") Long studentId,
			@PathVariable(value = "course_id") Long courseId) {
		ModelAndView modelAndView = new ModelAndView();
		ExamKeys id = new ExamKeys(studentId, courseId);
		Exam exam = examRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Exam", "id", id));
		modelAndView.addObject("exam", exam);
		modelAndView.setViewName("exam");
		return modelAndView;
	}

	@GetMapping("/student/{student_id}") // Maps GET requests
	public ModelAndView getExamsByStudentID(@PathVariable(value = "student_id") Long studentId) {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Exam> exams = examRepository.findAllByUserID(studentId);
		modelAndView.addObject("exams", exams);
		modelAndView.setViewName("exams");
		return modelAndView;
	}

	@GetMapping("/course/{course_id}") // Maps GET requests
	public ModelAndView getExamsByCourseID(@PathVariable(value = "course_id") Long courseId) {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Exam> exams = examRepository.findAllByCourseID(courseId);
		modelAndView.addObject("exams", exams);
		modelAndView.setViewName("exams");
		return modelAndView;
	}

	@PostMapping("/update/student/{student_id}/course/{course_id}") // Maps PUT requests
	public ModelAndView updateExam(@PathVariable(value = "student_id") Long studentId,
			@PathVariable(value = "course_id") Long courseId, @RequestParam Byte evaluation) {
		
		if (evaluation == null)
			throw new EmptyFieldException("evaluation");
		if (evaluation < 18 || evaluation > 31)
			throw new DomainConstraintViolationException("evaluation", "between 18 and 31");
		
		ExamKeys id = new ExamKeys(studentId, courseId);
		Exam examToUpdate = examRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Exam", "id", "(" + id.getStudent() + ", " + id.getCourse() + ")"));
		examToUpdate.setEvaluation(evaluation);
		examRepository.saveAndFlush(examToUpdate);
		return getExam(studentId, courseId);
	}

	@PostMapping("/delete/student/{student_id}/course/{course_id}") // Maps DELETE requests
	public ModelAndView deleteExam(@PathVariable(value = "student_id") Long studentId,
			@PathVariable(value = "course_id") Long courseId) {
		ExamKeys id = new ExamKeys(studentId, courseId);
		Exam exam = examRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Exam", "id", id));
		examRepository.delete(exam);
		return getExams();
	}

}
