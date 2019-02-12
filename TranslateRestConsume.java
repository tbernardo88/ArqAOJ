package com.fiap.aoj.ms.translateMs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class TranslateRestConsume {

	//final String uri ="https://jsonplaceholder.typicode.com/todos/{id}";
	//final String uri ="https://jsonplaceholder.typicode.com/todos/1";
	final String uri = "https://httpbin.org/get?nome={nome}";
	
	//"https://httpbin.org/get?nome=Tata"

	public TranslateRestConsume() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTranslate() {
		
		//UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri).queryParam("page", "2");
				
		RestTemplate restTemplate = new RestTemplate();
		//String teste = builder.toUriString();
		String result = restTemplate.getForObject(uri, String.class,"Tata");	
		
		//String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/{page}",String.class,"1");
		//String result = restTemplate.getForObject(builder.toUriString(), String.class);		
		//String chave = TranslateUtils.CHAVE_SERVICO;
		
		return result;
	}

}

****************POST****************************

package com.fiap.aoj.ms.translateMs;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
public class TranslateRestConsume {

	//final String uri ="https://jsonplaceholder.typicode.com/todos/{id}";
	//final String uri ="https://jsonplaceholder.typicode.com/todos/1";
	final String uri = "https://httpbin.org/post";
	
	
	
	
	//"https://httpbin.org/get?nome=Tata"

	public TranslateRestConsume() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTranslate() {
		
	
		
		//UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri).queryParam("page", "2");
		MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
		param.add("nome", "Talita");
		
		
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject(uri, param, String.class);

		
		//String teste = builder.toUriString();
	    
		 //String result = restTemplate.postForObject(uri, String.class,"Tata");	
		
		//String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/{page}",String.class,"1");
		//String result = restTemplate.getForObject(builder.toUriString(), String.class);		
		//String chave = TranslateUtils.CHAVE_SERVICO;
		
		return response;
	}

}

