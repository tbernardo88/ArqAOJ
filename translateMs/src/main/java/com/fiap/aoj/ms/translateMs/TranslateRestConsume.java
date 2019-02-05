package com.fiap.aoj.ms.translateMs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TranslateRestConsume {

	final String uri = "https://jsonplaceholder.typicode.com/todos/1";
	
	public TranslateRestConsume() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTranslate() {
		
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);		
		String chave = TranslateUtils.CHAVE_SERVICO;
		
		return result;
	}

}
