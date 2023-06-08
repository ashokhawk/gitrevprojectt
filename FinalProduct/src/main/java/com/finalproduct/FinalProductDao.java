package com.finalproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FinalProductDao {
	@Autowired
	FinalProductRepository fr;

	public String setFinalProduct(List<FinalProduct> p) {
		fr.saveAll(p);
		return "saved";
	}
	
	
	
}
