package com.flipkart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	
	@Query(value = "select order_name.city,product.name FROM order_name JOIN product ON order_name.id=product.order_fk",nativeQuery = true)
	public  List<Object> getDetails();
}
