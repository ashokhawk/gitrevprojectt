package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlipkartController {

	@Autowired
	FlipkartService fs;
	
	@PostMapping("/setOrderDetail")
	public String setOrder(@RequestBody Order ord) {
		return fs.setOrder(ord);
	}
	
	
	@GetMapping(value="/getorders")
	public List<Order> getOrders() {
		return fs.getOrders();
	}
	
	@GetMapping(value="/getObject")
	public List<Object> getDetails() {
		return fs.getDetails();
	}

	
	
}
