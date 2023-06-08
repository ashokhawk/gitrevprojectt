package com.Mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	
	@Autowired
	MobileService ms;
	@PostMapping(value="/getName/{brand}")
	public String getName(@PathVariable  String brand) {
		return ms.getName(brand);
	}
	
	

}
