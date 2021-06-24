package com.afc.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/first")
public class FirstController {
	
	@GetMapping
	public String first() {
		return "Atenção aos detalhes, mentalidade de crescimento e persistência";
	}
	
}
