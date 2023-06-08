package com.automobiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
	
	