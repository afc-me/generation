package com.afc.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	
	@GetMapping
	public String second() {
		return "Aprender a manipular o SpringBoot e a integração do banco de dados ao Java.";
	}

}
