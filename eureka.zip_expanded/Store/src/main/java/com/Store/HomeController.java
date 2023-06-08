package com.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
@Autowired
RestTemplate r;
@GetMapping("/getprodbyrest")
public String getprodbyrest() {
	String u1="http://localhost:8089/getprod";
	ResponseEntity <String> s=r.exchange(u1,HttpMethod.GET,null,String.class);
	String a=s.getBody();
	return a;
}
@GetMapping("/contact")
public String getcontact() {
	return "contact";
}
}
