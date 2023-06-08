package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlipkartDao {

	@Autowired
	OrderRepository or;

	public String setOrder(Order ord) {
		or.save(ord);
		return "saved";
	}
	
	public List<Order> getOrders() {
		return or.findAll();
	}

	public List<Object> getDetails() {
		return or.getDetails();
	}
}
