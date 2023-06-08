package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.exception.IdNotFound;
import com.electronics.repository.AcRepository;

@Repository
public class AcDao {

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

	public Ac getByid(int id) throws IdNotFound {
		return ar.findById(id).orElseThrow( ()->new IdNotFound("not found"));
	}


}
