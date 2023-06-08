package com.Items;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
@GetMapping("/getprod")
public String getprod() {
	return "product";
}
@GetMapping("/order")
public String getorder() {
	return "order";
}
}
