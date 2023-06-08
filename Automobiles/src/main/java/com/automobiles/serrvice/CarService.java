package com.automobiles.serrvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.automobiles.doa.CarDoa;
import com.automobiles.entity.Car;

@Service
public class CarService {

	@Autowired
	CarDoa cd;
	
	
	
	public String setCar(List<Car> c) {
		return cd.setCar(c);
}



	public List<Car> getCar() {
		return cd.getCar();
	}
}
