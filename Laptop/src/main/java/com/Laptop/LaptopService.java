package com.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	
	@Autowired
	LaptopDao ld;
	
	public String setLap(Laptop l) {
		return ld.setLap(l);
	}
	
	
	public String setLaps(List<Laptop> l1) {
		return ld.setLaps(l1);
	}
	
	public List<Laptop> getLaps() {
		return ld.getLaps();
	}


	public Laptop getLapsById(int id) {
		return ld.getLapsById(id);
	}


	public String DelLapsById(int id) {	
		return ld.DelLapsById(id);
	}


	public List<Laptop> getLapsByName(String name) {
		return ld.getLapsbyName(name);
	}


	public List<Laptop> getLapsByRange(int a,int b) {
		return ld.getLapsByRange(a,b);
	}

	public Integer getMax() { 
		return ld.getMax();
		}
		
}
