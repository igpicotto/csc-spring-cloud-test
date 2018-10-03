package com.claro.amx.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claro.amx.dao.ConsumerSvcClient;

@RestController
@Component
public class ServiceImpl {
	
	private static Logger LOG = LoggerFactory.getLogger(ServiceImpl.class);
	
	@Autowired
	ConsumerSvcClient consumerSvcClient;
	@Autowired
	ServicesClients cliente;
	
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public Map<String, String> getPrueba() {
		
		LOG.info("Dentro de csc-business-service.");
		
		Map<String, String> mapa = cliente.getConsumerResult();
		
		mapa.put("business-message", "Mensaje de la capa Business.");
		
		return mapa;
		
	}

	
}
