package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	@GetMapping("/getProduct")
	public String getProduct() {
		return "product";
	}

	
}
