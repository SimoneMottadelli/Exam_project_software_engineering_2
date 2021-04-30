package it.unimib.campus.swdevcourse.mycrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.unimib.campus.swdevcourse.mycrudapp.exception.EmptyFieldException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceNotFoundException;
import it.unimib.campus.swdevcourse.mycrudapp.model.Course;
import it.unimib.campus.swdevcourse.mycrudapp.repository.CourseRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/courses")
public class CourseController {

	@Autowired
	CourseRepository courseRepository;

	@GetMapping("/{id}")
	public ModelAndView getCourse(@PathVariable("id") Long courseId) {
		ModelAndView modelAndView = new ModelAndView();
		Course m = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course", "id", courseId));
		modelAndView.addObject("course", m);
		modelAndView.setViewName("course");
		return modelAndView;
	}

	@GetMapping("/")
	public ModelAndView getCourses() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Course> courses = courseRepository.findAll();
		modelAndView.addObject("courses", courses);
		modelAndView.setViewName("courses");
		return modelAndView;
	}

	@PostMapping(path = "/add/") // Map POST requests
	public ModelAndView addCourse(@RequestParam String name) {
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		Course course = new Course(name);
		courseRepository.saveAndFlush(course);
		return getCourses();
	}

	@PostMapping("/update/{id}") // Maps PUT requests
	public ModelAndView updateCourse(@PathVariable(value = "id") Long courseId, @RequestParam String name) {
		Course courseToUpdate = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course", "id", courseId));
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		courseToUpdate.setName(name);
		courseRepository.saveAndFlush(courseToUpdate);
		return getCourse(courseId);
	}

	@PostMapping("/delete/{id}") // Maps DELETE requests
	public ModelAndView deleteCourse(@PathVariable(value = "id") Long courseId) {
		Course course = courseRepository.findById(courseId)
				.orElseThrow(() -> new ResourceNotFoundException("Course", "id", courseId));
		courseRepository.delete(course);
		return getCourses();
	}

}
