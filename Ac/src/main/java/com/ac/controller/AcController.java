package com.ac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ac.service.AcService;

import ac.Ac;

@RestController
public class AcController {
	
	@Autowired
	AcService as;
	
	
	@PostMapping(value="/setAcs")
	public  String setAcs(List<Ac> a) {
		return as.setAcs(a);
	}
	
	@PostMapping(value="/setAc")
	public String setAc(Ac b) {
		return as.setAc(b);
	}

}
