package org.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Julio") String name,
			@RequestParam(name = "lastName", required = false, defaultValue = "Rebatta") String lastName, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("lastName", lastName);
		return "greeting";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
}
