package com.automobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Car;
import com.automobiles.serrvice.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService cs;
	
	
	@PostMapping(value="/setCarr")
	public String setCar(@RequestBody List<Car> c) {
		return cs.setCar(c);
	}
	
	@GetMapping(value="/getcar")
	public List<Car> getCar() {
		return cs.getCar();
	}
	
	

}
