package br.senai.rn.agenda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fone")
public class FoneController {
	
	@GetMapping
	public String index(Model model) {
		return "index";
	}
	
}
