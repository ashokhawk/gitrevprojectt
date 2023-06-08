package com.automobiles.doa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.automobiles.entity.Bike;
import com.automobiles.repository.BikeRepository;





@Repository
public class BikeDoa {
	
	@Autowired
	BikeRepository br;
	
	public String setBike(List<Bike> b) {
		 br.saveAll(b);
		 return "saved";
	}
	
	public List<Bike> getBike() {
		return br.findAll();
	}
	
	

}
