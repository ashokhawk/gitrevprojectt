package com.trail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Sample {
	
	@GetMapping(value="/print")
	public String display() {
		return "Hello.html";
	}

}
