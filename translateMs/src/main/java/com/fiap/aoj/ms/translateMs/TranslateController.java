package com.fiap.aoj.ms.translateMs;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	private String oi() throws UnknownHostException {
		
		return translateRestConsume.getTranslate();
		
	}

}
