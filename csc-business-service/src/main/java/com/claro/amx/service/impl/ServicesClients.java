package com.claro.amx.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.claro.amx.dao.ConsumerSvcClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
public class ServicesClients {
	
	@Autowired
	ConsumerSvcClient consumerSvcClient;
	
	@HystrixCommand(fallbackMethod = "getConsumerResultDefault")
	public Map<String, String> getConsumerResult() {
		
		// TODO: Ver de hacer esto en otro Hilo
		Map<String, String> mapa = consumerSvcClient.message();
		
		mapa.put("business-message-ok", "Mensaje de la capa Business desde el SVC.");
		
		return mapa;
		
	}
	
	
	public Map<String, String> getConsumerResultDefault(Throwable throwable) {
		
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("business-message-error", "ERROR!!!!!.");
		
		return mapa;
		
	}

}
