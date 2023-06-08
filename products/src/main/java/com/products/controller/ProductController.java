package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.entity.Product;
import com.products.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;

	@PostMapping(value="/setProduct")
	public String setProduct(@RequestBody Product p) {
		return ps.setProduct(p);
	}
	
	@PostMapping(value="/setProducts")
	public String setProducts(@RequestBody List<Product> p) {
		return ps.setProducts(p);
	}

	@GetMapping(value = "/getProducts")
	public List<Product> getProducts() {
		return ps.getProducts();
	}
	
}
