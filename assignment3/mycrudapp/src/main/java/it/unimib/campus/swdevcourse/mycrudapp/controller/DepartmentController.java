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
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceNotFoundException;
import it.unimib.campus.swdevcourse.mycrudapp.model.Department;
import it.unimib.campus.swdevcourse.mycrudapp.repository.DepartmentRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/departments")
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentRepository;

	@GetMapping("/") // Maps GET requests
	public ModelAndView getDepartments() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Department> dep = departmentRepository.findAll();
		modelAndView.addObject("departments", dep);
		modelAndView.setViewName("departments");
		return modelAndView;
	}

	@GetMapping("/{id}/professors")
	public ModelAndView getProfessors(@PathVariable("id") Long departmentId) {
		ModelAndView modelAndView = new ModelAndView();
		Department department = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
		modelAndView.addObject("people", department.getProfessors());
		modelAndView.setViewName("professors");
		return modelAndView;
	}

	@PostMapping(path = "/add/") // Map POST requests
	public ModelAndView addDepartment(@RequestParam String name, @RequestParam Long telephone) {
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		if (telephone == null)
			throw new EmptyFieldException("telephone");
		if (telephone < 0)
			throw new DomainConstraintViolationException("telephone", "positive");
		Department department = new Department(name, telephone);
		departmentRepository.saveAndFlush(department);
		return getDepartments();
	}

	@GetMapping("/{id}") // Maps GET requests
	public ModelAndView getDepartment(@PathVariable("id") Long departmentId) {
		ModelAndView modelAndView = new ModelAndView();
		Department d = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
		modelAndView.addObject("department", d);
		modelAndView.setViewName("department");
		return modelAndView;
	}

	@PostMapping("/update/{id}") // Maps PUT requests
	public ModelAndView updateCourse(@PathVariable(value = "id") Long departmentId, @RequestParam String name,
			@RequestParam Long telephone) {
		Department departmentToUpdate = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		else
			departmentToUpdate.setName(name);
		if (telephone == null)
			throw new EmptyFieldException("telephone");
		else if (telephone < 0)
			throw new DomainConstraintViolationException("telephone", "positive");
		else
			departmentToUpdate.setTelephone(telephone);
		departmentRepository.saveAndFlush(departmentToUpdate);
		return getDepartment(departmentId);
	}

	@PostMapping("/delete/{id}") // Maps DELETE requests
	public ModelAndView deleteDepartment(@PathVariable(value = "id") Long departmentId) {
		Department department = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department", "id", departmentId));
		departmentRepository.delete(department);
		return getDepartments();
	}

}
