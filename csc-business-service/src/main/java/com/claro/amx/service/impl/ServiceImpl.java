package com.claro.amx.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.amx.dao.ConsumerSvcClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@Component
public class ServiceImpl {
	
	@Autowired
	ConsumerSvcClient consumerSvcClient;
	@Autowired
	ServicesClients cliente;
	
//	@HystrixCommand(fallbackMethod = "getConsumerResultDefault")
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public Map<String, String> getPrueba() {
		
//		ServicesClients cliente = new ServicesClients();
		
		Map<String, String> mapa = cliente.getConsumerResult();//consumerSvcClient.message();
		mapa.put("business-message", "Mensaje de la capa Business.");
		
		return mapa;
		
	}

//	@HystrixCommand(fallbackMethod = "getConsumerResultDefault")
//	public Map<String, String> getConsumerResult() {
//		
//		Map<String, String> mapa = consumerSvcClient.message();
//		
//		mapa.put("business-message", "Mensaje de la capa Business.");
//		
//		return mapa;
//		
//	}
//	
//	public Map<String, String> getConsumerResultDefault() {
//		
//		Map<String, String> mapa = new HashMap<>();
//		mapa.put("business-message", "ERROR!!!!!.");
//		
//		return mapa;
//		
//	}

	
}
