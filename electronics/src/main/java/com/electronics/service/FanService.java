package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.electronics.dao.FanDao;
import com.electronics.entity.Fan;
import com.electronics.exception.lowPriceException;

@Service
public class FanService {
	
	@Autowired
	FanDao fd;

	
	@ExceptionHandler(lowPriceException.class)
	public String setFan(Fan f) throws lowPriceException {
		if(f.getPrice() <2000) {
			throw new lowPriceException("lower Than 2000");	
		}
		else {
			return fd.setFan(f);
		}
	}	
	

	@ExceptionHandler(lowPriceException.class)
	public String setFans(List<Fan> f) throws lowPriceException {
		List<Fan>z=f.stream().filter(x->x.getPrice()<2000).toList();
		
			if(z.isEmpty()) {
			return fd.setFans(f);
		}
		else 
		{
			throw new lowPriceException("Invalid Data");
		}
	}
	
}
