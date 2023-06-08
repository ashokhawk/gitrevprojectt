package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlipkartService {

	@Autowired
	FlipkartDao fd;

	public String setOrder(Order ord) {
		return fd.setOrder(ord);
	}


	public List<Order> getOrders() {
		return fd.getOrders();
	}


	public List<Object> getDetails() {
		return fd.getDetails();
	}
}
