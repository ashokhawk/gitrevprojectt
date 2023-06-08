package com.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

	@Autowired
	LaptopService ls;
	@PostMapping(value="/setLap")
	public String setLap(@RequestBody Laptop l) {
		return ls.setLap(l);
	}
	
	
	@PostMapping(value="/setLaps")
	public String setLaps(@RequestBody List<Laptop> l1) {
		return ls.setLaps(l1);
	}
	
	@GetMapping(value="/getLaps")
	public List<Laptop> getLaps() {
		return ls.getLaps();
	}
	
	@GetMapping(value="/getLapById/{id}") 
		public Laptop getLapsById(@PathVariable int id) {
			return ls.getLapsById(id);
		}
	
	@GetMapping(value="/getLapsByName/{name}")
	public List<Laptop> GetLapsByName(@PathVariable String name) {
		return ls.getLapsByName(name);
		
	}


	@GetMapping(value="/delLapById")
		public String DelLapsById(@PathVariable int id) {
		return ls.DelLapsById(id);
	}
	
	
	@GetMapping(value="/getLapByRange/{a}/{b}")
		public List<Laptop> getLapsByRange(@PathVariable int a,@PathVariable int b) {
			return ls.getLapsByRange(a,b);
	}
	
	@GetMapping(value="/getMax")
	public Integer getMax() { 
		return ls.getMax();
	}
		
	
}
