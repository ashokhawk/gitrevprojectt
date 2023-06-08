package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Fan;
import com.electronics.exception.lowPriceException;
import com.electronics.service.FanService;

@RestController
@RequestMapping(value="/fan")
public class FanController {
	@Autowired
	FanService fs;
	
	@PostMapping(value="/setFan")
	public String setFan(@RequestBody Fan f) throws lowPriceException {
		return fs.setFan(f);
	}
	
	@PostMapping(value="/setFans")
	public String setFans(@RequestBody List<Fan> f) throws lowPriceException {
		return fs.setFans(f);
	}

}
