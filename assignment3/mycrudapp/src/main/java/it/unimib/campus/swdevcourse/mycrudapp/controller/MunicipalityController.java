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

import it.unimib.campus.swdevcourse.mycrudapp.exception.EmptyFieldException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.IntegrityViolationException;
import it.unimib.campus.swdevcourse.mycrudapp.exception.ResourceNotFoundException;
import it.unimib.campus.swdevcourse.mycrudapp.model.Municipality;
import it.unimib.campus.swdevcourse.mycrudapp.repository.MunicipalityRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/municipalities") // This means URL's start with /municipalities (after Application path)
public class MunicipalityController {

	@Autowired
	MunicipalityRepository municipalityRepository;

	@GetMapping("/") // Maps GET requests
	public ModelAndView getMunicipalities() {
		ModelAndView modelAndView = new ModelAndView();
		Iterable<Municipality> m = municipalityRepository.findAll();
		modelAndView.addObject("municipalities", m);
		modelAndView.setViewName("municipalities");
		return modelAndView;
	}

	@PostMapping(path = "/add/") // Map POST requests
	public ModelAndView addMunicipality(@RequestParam String name, @RequestParam Long provinceId) {
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		Municipality newMunicipality = new Municipality();
		newMunicipality.setName(name);
		if (provinceId != null) {
			Municipality province = municipalityRepository.findById(provinceId)
					.orElseThrow(() -> new IntegrityViolationException("the province must exist"));
			newMunicipality.setProvince(province);
		} else
			newMunicipality.setProvince(newMunicipality);
		municipalityRepository.saveAndFlush(newMunicipality);
		return getMunicipalities();
	}

	@GetMapping("/{id}") // Maps GET requests
	public ModelAndView getMunicipality(@PathVariable("id") Long municipalityId) {
		ModelAndView modelAndView = new ModelAndView();
		Municipality m = municipalityRepository.findById(municipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", municipalityId));
		modelAndView.addObject("municipality", m);
		modelAndView.setViewName("municipality");
		return modelAndView;
	}

	@GetMapping("/{id}/municipalities/") // Maps GET requests
	public ModelAndView getMunicipalities(@PathVariable("id") Long municipalityId) {
		ModelAndView modelAndView = new ModelAndView();
		Municipality m = municipalityRepository.findById(municipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", municipalityId));
		modelAndView.addObject("municipalities", m.getMunicipalities());
		modelAndView.setViewName("municipalities");
		return modelAndView;
	}
	
	@GetMapping("/find") // Maps GET requests
	public ModelAndView getMunicipalitiesByName(@PathParam(value = "name") String  name) {
		ModelAndView modelAndView =  new ModelAndView();
		Iterable<Municipality> municipalities = municipalityRepository.findAllByName(name);
		modelAndView.addObject("municipalities", municipalities);
		modelAndView.addObject("name", name);
		modelAndView.setViewName("municipalities");
		return modelAndView;
	}

	@PostMapping("/update/{id}") // Request that implements the update operation
	public ModelAndView updateMunicipality(@PathVariable(value = "id") Long municipalityId, @RequestParam String name,
			@RequestParam Long provinceId) {
		
		if (name == null || name.isEmpty())
			throw new EmptyFieldException("name");
		
		Municipality municipalityToUpdate = municipalityRepository.findById(municipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", municipalityId));
		municipalityToUpdate.setName(name);
		
		if (provinceId != null) {
			if (municipalityToUpdate.isProvince() && municipalityToUpdate.getMunicipalities().size() > 1)
				throw new IntegrityViolationException("the municipality with id " + municipalityId + " is province of one or more municipalities");
			Municipality province = municipalityRepository.findById(provinceId)
					.orElseThrow(() -> new IntegrityViolationException("the province must exist"));
			if (!province.isProvince())
				throw new IntegrityViolationException("the province must exist");
			municipalityToUpdate.setProvince(province);
		} else
			municipalityToUpdate.setProvince(municipalityToUpdate);
		municipalityRepository.saveAndFlush(municipalityToUpdate);
		return getMunicipality(municipalityId);
	}

	@PostMapping("/delete/{id}") // Request that implements the delete operation
	public ModelAndView deleteMunicipality(@PathVariable(value = "id") Long municipalityId) {
		Municipality municipality = municipalityRepository.findById(municipalityId)
				.orElseThrow(() -> new ResourceNotFoundException("Municipality", "id", municipalityId));
		municipalityRepository.delete(municipality);
		return getMunicipalities();
	}

}
