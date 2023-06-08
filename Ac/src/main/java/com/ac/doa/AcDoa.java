package com.ac.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ac.repository.AcRepository;

import ac.Ac;

@Repository
public class AcDoa {

	@Autowired
	AcRepository ar;
	public String setAcs(List<Ac> a) {
		ar.saveAll(a);
		return "Saved";
	}
	
	public String setAc(Ac b) {
		ar.save(b);
		return "Saved";
	}

}
