package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Ac;
import com.electronics.exception.IdNotFound;
import com.electronics.service.AcService;

@RestController
@RequestMapping(value="/ac")
public class AcController {
	
	@Autowired
	AcService as;
	
	
	@PostMapping(value="/setAcs")
	public  String setAcs(@RequestBody List<Ac> a) {
		return as.setAcs(a);
	}
	
	@PostMapping(value="/setAc")
	public String setAc(@RequestBody Ac b) {
		return as.setAc(b);
	}

	
	@GetMapping(value="/getById/{id}")
	public Ac getByid(@PathVariable int id) throws IdNotFound {
		return as.getByid(id);
	}
	
	@PutMapping(value="/update/{id}")
	public String updateAc(@RequestBody Ac a,@PathVariable int id) throws IdNotFound {
		return as.updateAc(a,id);
	}
	
	
}
