package com.automobiles.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.automobiles.entity.Car;
import com.automobiles.repository.CarRepository;

@Repository
public class CarDoa {

	@Autowired
	CarRepository cr;
	
	public String setCar(List<Car> c) {
		 cr.saveAll(c);
		 return "saved";
}


	public List<Car> getCar() {
	
		return cr.findAll();
		
		
	}
}
