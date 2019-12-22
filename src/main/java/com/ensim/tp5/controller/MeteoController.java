package com.ensim.tp5.controller;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.ensim.tp5.model.DarkSky;
import com.ensim.tp5.model.Meteo;


@Controller
public class MeteoController {
	@PostMapping("/meteo")
	public String showMeteo(@RequestBody String adresse, Model model) {
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Meteo request = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adresse, Meteo.class);
		double longitude = request.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double latitude = request.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		DarkSky requestMeteo = restTemplate.getForObject("https://api.darksky.net/forecast/9cbe312a8222c91eba10c12a0e28dcda/"+latitude+","+longitude+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);
		model.addAttribute("adresse", request.getFeatures().get(0).getProperties().getLabel());
		model.addAttribute("localisation", request.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("meteo", requestMeteo.getCurrently().getTemperature());
		return "meteo";
	}
	

}
