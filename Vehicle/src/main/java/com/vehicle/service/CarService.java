package com.vehicle.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vehicle.Vehicle;
@Service
@Qualifier("Car")
public class CarService implements Vehicle {

	@Override
	public String getVehicle() {
		return "Hyundai Car";
	}

}
