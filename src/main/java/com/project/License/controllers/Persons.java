package com.project.License.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.project.License.models.License;
import com.project.License.models.Person;
import com.project.License.services.LicensesService;
import com.project.License.services.PersonsService;

@Controller
public class Persons{
	private final PersonsService personsService;
	private final LicensesService licensesService;
	public Persons(PersonsService personsService, LicensesService licensesService){
		this.personsService = personsService;
		this.licensesService = licensesService;
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person ) {
		return "newPerson";
	}
	@PostMapping("/persons/new")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult res) {
		if(res.hasErrors()) {
			return "newPerson";
		} else {
			personsService.addPerson(person);
			return "redirect:/persons/new";
		}
	}
	@RequestMapping("/persons/{id}")
	public String showPerson(Model model, @PathVariable("id") Long id) {
		Person person = personsService.findPersonById(id);
		model.addAttribute("person", person);
		return "showPerson";
	}	
}
