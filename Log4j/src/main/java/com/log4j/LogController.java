package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogController {
	public static Logger log =Logger.getLogger(LogController.class);
	
	@GetMapping(value = "/demolog")
	public String getLog() {
		 
	
		PropertyConfigurator.configure("logSpring");
	
		log.info("Sum");
		log.warn("No warning");
		log.error("no error");
		log.fatal("no fatal");
		log.debug("no debug");
	
	return "saved";
	
	}
		

	

	

	}	
		
		

