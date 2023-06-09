package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.JoinQueryService;

@Controller
public class JoinQueryController {
	@Autowired
	private JoinQueryService joinQueryService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", joinQueryService.getEmployeesInnerJoin());
		return "index";
	}

}
