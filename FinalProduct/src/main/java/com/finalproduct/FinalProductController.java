package com.finalproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FinalProductController {
	@Autowired
	FinalProductSevice fs;
	@Autowired
	RestTemplate rt;	
	
	@GetMapping(value="/getFinalProduct")
	public List<FinalProduct> getFinalProduct() {
		
	String url1= "http://localhost:8081/getProducts";
	String url2="http://localhost:8082/getTaxByHsn/";
			
	ResponseEntity<List<FinalProduct>> r=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<FinalProduct>>() {});
	List<FinalProduct> p=r.getBody();
	p.forEach(x-> {
		int h=x.getHsn();
		ResponseEntity<Integer> r2=rt.exchange(url2+h, HttpMethod.GET, null, Integer.class);
		int tax=r2.getBody();
		x.setPrice(x.getPrice()+x.getPrice()*tax/100);
	});	
		return p;
	}
	@PostMapping(value="/setFinalProduct")
	public String setFinalProduct() {
		
	String url1= "http://localhost:8081/getProducts";
	String url2="http://localhost:8082/getTaxByHsn/";
			
	ResponseEntity<List<FinalProduct>> r=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<FinalProduct>>() {});
	List<FinalProduct> p=r.getBody();
	p.forEach(x-> {
		int h=x.getHsn();
		ResponseEntity<Integer> r2=rt.exchange(url2+h, HttpMethod.GET, null, Integer.class);
		int tax=r2.getBody();
		x.setPrice(x.getPrice()+x.getPrice()*tax/100);
	});
		return fs.setFinalProduct(p);
	}
	}
	


