package com.automobiles.serrvice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobiles.doa.BikeDoa;
import com.automobiles.entity.Bike;

@Service
public class BikeService {
	
	@Autowired
	BikeDoa bd;

	public String setBike(List<Bike> b) {
		return bd.setBike(b);
	}
	
	public List<Bike> getBike() {
		return bd.getBike();
	}

	public List<Bike> getByPrice(int price) {
	
		List<Bike> x=getBike();
		
		List<Bike> z=x.stream().filter(y->y.getPrice()==price).collect(Collectors.toList());
		
		return z;
	}

	public Bike getMax() {
		List<Bike> x=getBike();
		Bike max= x.stream().max(Comparator.comparing(Bike::getPrice)).get();
		return max;
	
	}
		public Bike getMin() {
			List<Bike> x=getBike();
			Bike min= x.stream().max(Comparator.comparing(Bike::getPrice)).get();
			return min;
			
		}
	

		public Bike GetSecMax() {
			List<Bike> l=getBike();
			Bike secMax=l.stream().sorted(Comparator.comparing(Bike::getPrice).reversed()).skip(1).findFirst().get();
			return secMax;
		}
		
		public Bike GetSecMin() {
			List<Bike> l=getBike();
			Bike secMin=l.stream().sorted(Comparator.comparing(Bike::getPrice)).skip(1).findFirst().get();
			return secMin;
		}
		
		
		
	}


	
	

