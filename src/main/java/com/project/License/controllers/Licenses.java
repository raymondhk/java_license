package com.project.License.controllers;

import java.security.Principal;
import java.util.Date;
import java.util.List;
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
public class Licenses{
	//Member variables go here
	private final LicensesService licensesService;
	private final PersonsService personsService;
	public Licenses(LicensesService licensesService, PersonsService personsService) {
		this.licensesService = licensesService;
		this.personsService = personsService;
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(Model model, @ModelAttribute("license") License license, BindingResult res) {
		List<Person> persons = personsService.allPersons();
		model.addAttribute("persons", persons);
		return "newLicense";
	}
	@PostMapping("/licenses/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult res) {
		if(res.hasErrors()) {
			return "newLicense";
		} else {
			licensesService.addLicense(license);
			return "redirect:/licenses/new";
		}
	}	
}
