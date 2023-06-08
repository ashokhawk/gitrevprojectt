package com.vehicle.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.vehicle.Vehicle;

@Service
@Primary

@Qualifier("Bike")
public class BikeService implements Vehicle {

	
	public String getVehicle() {
		return "Yamaha Bike";
	}

}
