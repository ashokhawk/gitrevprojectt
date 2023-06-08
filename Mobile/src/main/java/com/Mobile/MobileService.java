package com.Mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {

	@Autowired
	MobileDao md;
	public String getName(String brand) {
		return md.getName(brand);
	}

}
