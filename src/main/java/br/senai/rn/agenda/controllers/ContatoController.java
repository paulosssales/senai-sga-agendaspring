package br.senai.rn.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.agenda.services.ServiceContato;

@Controller
@RequestMapping("/")
public class ContatoController {
	
	@Autowired
	private ServiceContato service;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("contato", service.findAll());
		return "index";
	}
}
