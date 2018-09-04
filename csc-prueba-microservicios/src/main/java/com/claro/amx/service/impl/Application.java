package com.claro.amx.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prueba")
public class Application {

//	@Value("${service.name}")
	String name = "World";

	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public String home() {
		
		return "Hello " + name;
	}


}
