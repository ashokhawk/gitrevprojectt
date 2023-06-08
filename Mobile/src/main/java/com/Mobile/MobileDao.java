package com.Mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MobileDao {

	@Autowired
	MobileRepo mr;
	public String getName(String brand) {
		
		
		
		return "added";
		 
		
	}

}
