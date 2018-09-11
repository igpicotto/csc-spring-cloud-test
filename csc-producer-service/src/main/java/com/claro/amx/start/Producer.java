package com.claro.amx.start;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Producer {
	private Data datos;
	
	
	public Producer(Data datos) {
		this.datos = datos;
	}

	@RefreshScope
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, String> message() {
		
		Map<String, String> response = new HashMap<>();
		
		response.put("message",datos.getMessage());//message);
		response.put("global-message", datos.getGlobalMessage());//globalMessage);
		
		return response;
	}
}