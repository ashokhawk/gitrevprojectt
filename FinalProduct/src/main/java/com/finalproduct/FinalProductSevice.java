package com.finalproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinalProductSevice {
	@Autowired
	FinalProductDao fd;
	
	public String setFinalProduct(List<FinalProduct> p) {
		return fd.setFinalProduct(p);
	}

}
