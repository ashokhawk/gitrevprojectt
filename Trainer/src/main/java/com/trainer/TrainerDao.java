package com.trainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class TrainerDao {

	@Autowired
	TrainerRepository tr;

	public String setTrainers(List<Trainer> trainers) {
		tr.saveAll(trainers);
		return "saved";
	}

	public List<Trainer> getTrainers() {
		return tr.findAll();
	}

	public Trainer getById(int id) {
		return tr.findById(id).get();
	}

	
	
}
