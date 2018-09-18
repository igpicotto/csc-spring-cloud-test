package com.claro.amx.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.amx.dao.ConsumerSvcClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ServiceImpl {
	
	@Autowired
	ConsumerSvcClient consumerSvcClient;
	
	@HystrixCommand(fallbackMethod = "getPruebaDefault")
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public Map<String, String> getPrueba() {
		
		Map<String, String> mapa = consumerSvcClient.message();
		
		mapa.put("business-message", "Mensaje de la capa Business.");
		
		return mapa;
		
	}

	public Map<String, String> getPruebaDefault() {
		
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("business-message", "ERROR!!!!!.");
		
		return mapa;
		
	}

	
}
