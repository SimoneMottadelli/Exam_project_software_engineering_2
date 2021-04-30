package it.unimib.campus.swdevcourse.mycrudapp.controller;

import javax.websocket.server.PathParam;

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
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceNotFoundException;
import it.unimib.campus.swdevcourse.mycrudapp.model.Department;
import it.unimib.campus.swdevcourse.mycrudapp.model.Municipality;
import it.unimib.campus.swdevcourse.mycrudapp.model.Person;
import it.unimib.campus.swdevcourse.mycrudapp.model.Professor;
import it.unimib.campus.swdevcourse.mycrudapp.model.Student;
import it.unimib.campus.swdevcourse.mycrudapp.repository.DepartmentRepository;
import it.unimib.campus.swdevcourse.mycrudapp.repository.MunicipalityRepository;
import it.unimib.campus.swdevcourse.mycrudapp.repository.PersonRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/people") // This means URL's start with /people (after Application path)
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	@Autowired
	MunicipalityRepository municipalityRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	@GetMapping("/{id}") // Maps GET requests
	public ModelAndView getPerson(@PathVariable("id") Long personId) {
		ModelAndView modelAndView = new ModelAndView();
		Person person = personRepository.findById(personId)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));
		modelAndView.addObject("person", person);
		if (person instanceof Student)
			modelAndView.setViewName("student");
		else if (person instanceof Professor)
			modelAndView.setViewName("professor");
		return modelAndView;

	}

	@GetMapping("/") // Maps GET requests
	public ModelAndView getPeople() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Person> people = personRepository.findAll();
		modelAndView.addObject("people", people);
		modelAndView.setViewName("people");
		return modelAndView;
	}

	@GetMapping("/professors/") // Maps GET requests
	public ModelAndView getProfessors() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Professor> professors = personRepository.findAllProfessors();
		modelAndView.addObject("people", professors);
		modelAndView.setViewName("professors");
		return modelAndView;
	}

	@GetMapping("/students/") // Maps GET requests
	public ModelAndView getStudents() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Student> students = personRepository.findAllStudents();
		modelAndView.addObject("people", students);
		modelAndView.setViewName("students");
		return modelAndView;
	}
	
	@GetMapping("/find") // Maps GET requests
	public ModelAndView getPeopleByNameAndSurname(@PathParam(value = "name") String  name, @PathParam(value = "surname") String  surname) {
		ModelAndView modelAndView =  new ModelAndView();
		Iterable<Person> people = personRepository.findAllByNameAndSurname(name, surname);
		modelAndView.addObject("people", people);
		modelAndView.addObject("name", name);
		modelAndView.addObject("surname", surname);
		modelAndView.setViewName("people");
		return modelAndView;
	}

	@PostMapping(path = "/add/") // Map POST requests
	public ModelAndView addPerson(@RequestParam String name, @RequestParam String surname,
			@RequestParam Long birthMunicipalityId, @RequestParam String type,
			@RequestParam(required = false) Double isee, @RequestParam(required = false) Double salary,
			@RequestParam(required = false) Long departmentId) {

		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		if (surname == null || surname.isEmpty())
			throw new EmptyFieldException("surname");
		if (birthMunicipalityId == null)
			throw new EmptyFieldException("birthMunicipality");

		Person newPerson = null;
		Municipality birthMunicipality = municipalityRepository.findById(birthMunicipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", birthMunicipalityId));

		if (type.equals("student")) {
			if (isee == null)
				throw new EmptyFieldException("isee");
			if (isee < 0)
				throw new DomainConstraintViolationException("isee", "positive or 0");
			newPerson = new Student(name, surname, isee, birthMunicipality);
		} else if (type.equals("professor")) {
			if (salary == null)
				throw new EmptyFieldException("salary");
			if (salary < 0)
				throw new DomainConstraintViolationException("salary", "positive or 0");
			if (departmentId == null)
				throw new EmptyFieldException("department");
			Department department = departmentRepository.findById(departmentId)
					.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
			newPerson = new Professor(salary, name, surname, birthMunicipality, department);
		} else
			throw new EmptyFieldException("type");
		
		personRepository.saveAndFlush(newPerson);
		
		if (type.equals("student"))
			return getStudents();
		else
			return getProfessors();
	}

	@PostMapping("/update/{id}") // Maps PUT requests
	public ModelAndView updatePerson(@PathVariable(value = "id") Long personId, @RequestParam String name,
			@RequestParam String surname, @RequestParam Long birthMunicipalityId,
			@RequestParam(required = false) Double isee, @RequestParam(required = false) Double salary,
			@RequestParam(required = false) Long departmentId) {
		Person personToUpdate = personRepository.findById(personId)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));

		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		if (surname == null || surname.isEmpty())
			throw new EmptyFieldException("surname");
		if (birthMunicipalityId == null)
			throw new EmptyFieldException("birthMunicipality");

		Municipality birthMunicipality = municipalityRepository.findById(birthMunicipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", birthMunicipalityId));

		personToUpdate.setName(name);
		personToUpdate.setSurname(surname);
		personToUpdate.setBirthMunicipality(birthMunicipality);

		if (personToUpdate instanceof Student) {
			if (isee == null)
				throw new EmptyFieldException("isee");
			if (isee < 0)
				throw new DomainConstraintViolationException("isee", "positive or 0");
			((Student) personToUpdate).setIsee(isee);
		} else {
			if (salary == null)
				throw new EmptyFieldException("salary");
			if (salary < 0)
				throw new DomainConstraintViolationException("salary", "positive or 0");
			if (departmentId == null)
				throw new EmptyFieldException("department");
			Department department = departmentRepository.findById(departmentId)
					.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
			((Professor) personToUpdate).setSalary(salary);
			((Professor) personToUpdate).setDepartment(department);
		}
		personRepository.saveAndFlush(personToUpdate);
		
		return getPerson(personId);
	}

	@PostMapping("/delete/{id}") // Maps DELETE requests
	public ModelAndView deletePerson(@PathVariable(value = "id") Long personId, @RequestParam String sourcePage) {
		Person person = personRepository.findById(personId)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));
		personRepository.delete(person);
		if (sourcePage.equals("students"))
			return getStudents();
		else if (sourcePage.equals("professors"))
			return getProfessors();
		else
			return getPeople();
	}
}
