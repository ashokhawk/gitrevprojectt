package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.products.dao.ProductDao;
import com.products.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	
	public String setProduct(Product p) {
		return pd.setProduct(p);
	}
	
	public String setProducts(List<Product> p) {
		return pd.setProducts(p);
	}


	public List<Product> getProducts() {
		return pd.getProducts();
	}

}
