package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping(value = "/getvalue")
	public String getValue() {
	return "HelloWorld";
		
	}
	
	
}
