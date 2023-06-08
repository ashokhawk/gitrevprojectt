package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.electronics.dao.AcDao;
import com.electronics.entity.Ac;
import com.electronics.exception.IdNotFound;

@Service
public class AcService {

	@Autowired
	AcDao ad;
	
	public String setAcs(List<Ac> a) {
		for(Ac x:a) {
			x.setNetPrice(x.getPrice()-x.getDiscount()*x.getPrice()/100);
		}
		return ad.setAcs(a);
	}
	
	public String setAc(Ac b) {
		int np=b.getPrice()-(b.getDiscount()*b.getPrice()/100);
		b.setNetPrice(np);
		return ad.setAc(b);
	}
	
	public Ac getByid(int id) throws IdNotFound {
		return ad.getByid(id);
	}

	public String updateAc(Ac a, int id) throws IdNotFound {
		Ac x=getByid(id);
		Ac y=a;
		
		x.setBrand(y.getBrand());
		x.setPrice(y.getPrice());
		x.setColor(y.getColor());
		x.setDiscount(y.getDiscount());
		
		setAc(x);
		
		return "Saved";
		
	}
	
	
	
	
	
}
