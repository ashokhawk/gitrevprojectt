package com.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.entity.Product;
import com.products.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository pr;
	
	public String setProduct(Product p) {
		pr.save(p);
		return "saved";
	}

	
	public String setProducts(List<Product> p) {
		pr.saveAll(p);
		return "Saved";
	}
	
	
	public List<Product> getProducts() {
		return pr.findAll();
	}
}
