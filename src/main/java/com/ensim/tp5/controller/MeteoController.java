package com.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MeteoController {
	@PostMapping("/adresse")
	public String envoi(Model model) {
		return "meteo";
	}
	

}
