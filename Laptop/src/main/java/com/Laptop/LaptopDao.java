package com.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopDao {

	@Autowired
	LaptopRepo lr;
	


	public String setLap(Laptop l) {
		lr.save(l);
		return "Saved";
	}
	


	public String setLaps(List<Laptop> l1) {
		lr.saveAll(l1);
		return "SavedAll";
	}
	
	public String setLaps1(List<Laptop> l) {
		lr.findById(2);
		return "SavedAll";
	}



	public List<Laptop> getLaps() {
		return lr.findAll();
	}


	public Laptop getLapsById(int id) {
		return lr.findById(id).get();
	}



	public String DelLapsById(int id) {
		 lr.deleteById(id);
		 return "Deleted";
	}



	public List<Laptop> getLapsbyName(String name) {
		 
		return lr.findByName(name);
		 
	}


	public List<Laptop> getLapsByRange(int a, int b) {
		return lr.getLapsByRange(a,b);

	}
	
	public Integer getMax() { 
		return lr.getMax();
		}
		
	
	





}
