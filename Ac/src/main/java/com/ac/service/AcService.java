package com.ac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.doa.AcDoa;

import ac.Ac;

@Service
public class AcService {

	@Autowired
	AcDoa ad;
	
	public String setAcs(List<Ac> a) {
		return ad.setAcs(a);
	}
	public String setAc(Ac b) {
		int np=b.getPrice()*b.getPrice()/100;
		b.setNetPrice(np);
		return ad.setAc(b);
	}
}
