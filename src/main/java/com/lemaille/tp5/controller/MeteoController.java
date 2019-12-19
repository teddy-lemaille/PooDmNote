package com.lemaille.tp5.controller;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.lemaille.tp5.model.DarkSky;
import com.lemaille.tp5.model.Result;

@Controller
public class MeteoController 
{
	@PostMapping ("/meteo")
	public String meteo(@RequestBody String Adresse,Model model) 
	{
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
		clientHttpReq.setProxy(proxy);
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Result result = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+Adresse, Result.class);
		//Adresse = Adresse.replaceAll("+", "");
		model.addAttribute("Adresse",Adresse);
		
		double longitude = result.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double latitude = result.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		model.addAttribute("longitude",longitude);
		model.addAttribute("latitude",latitude);
		model.addAttribute("ville",result.getFeatures().get(0).getProperties().getCity());
		DarkSky ds = restTemplate.getForObject("https://api.darksky.net/forecast/215d13437f7683f85ed969888f473662/"+latitude+","+longitude+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);		
		model.addAttribute("meteo",ds);
		return "meteo";
	}

}
