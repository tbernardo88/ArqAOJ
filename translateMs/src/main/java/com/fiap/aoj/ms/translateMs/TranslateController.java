package com.fiap.aoj.ms.translateMs;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TranslateController {

	@Autowired
	public TranslateRestConsume translateRestConsume;
	
	public TranslateController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.GET, value = "/translate", produces = "text/plain")
	private String translate(@RequestParam("idioma") String idioma, @RequestParam("texto") String texto) throws UnknownHostException {
		
		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		}catch(UnknownHostException e) {
			hostname = "Unknow";
		}
			
		return "Host: "+ hostname  + "\n" + translateRestConsume.getTranslate(idioma, texto);
		
	}

}
