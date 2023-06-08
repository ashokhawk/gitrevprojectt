package com.automobiles.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Bike;
import com.automobiles.serrvice.BikeService;

@RestController
public class BikeController {
	
	@Autowired
	BikeService bs;
	
	@PostMapping(value="/setBike")
	public String setBike(@RequestBody List<Bike> b) {
		return bs.setBike(b);
	}
	
	
	@GetMapping(value="/getBike")
	public List<Bike> getBike() {
		return bs.getBike();
	}
	
	@GetMapping(value="/getByPrice/{price}")
	public List<Bike> getByPrice(@PathVariable int price) {
		return bs.getByPrice(price);
	}
	
	@GetMapping(value="/getMax") 
	public Bike getMax() {
		return bs.getMax();
	}
	
	@GetMapping(value="/getMin")
	public Bike getMin() {
		return bs.getMin();
	}
	
	@GetMapping(value="/getSecondMax")
		public Bike GetSecMax() {
			return bs.GetSecMax();
		}
		
	@GetMapping(value="/getSecondMin")
	public Bike GetSecMin() {
		return bs.GetSecMin();
	}
	
}

