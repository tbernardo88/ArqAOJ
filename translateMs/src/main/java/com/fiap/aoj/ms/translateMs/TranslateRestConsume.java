package com.fiap.aoj.ms.translateMs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TranslateRestConsume {
	
	final String uri = "https://translation.googleapis.com/language/translate/v2?target={target}&format={format}&key={APIKEY}&q={text}";
	final String format ="text";	
	
	public TranslateRestConsume() {
		// TODO Auto-generated constructor stub
	}
		
	public String getTranslate(final String idioma, final String texto) {
		
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(uri, String.class, idioma, format, TranslateUtils.CHAVE_SERVICO, texto);		
		
		return response;
	}

}
