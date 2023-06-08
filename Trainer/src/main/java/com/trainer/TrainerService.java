package com.trainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainerService {

	@Autowired
	TrainerDao td;
	@Autowired
	TrainerRepository tr;

	public String setTrainers(List<Trainer> trainers) {
		
		return td.setTrainers(trainers);
	}

	public List<Trainer> getTrainers() {
		return td.getTrainers();
	}

	public Trainer getById(int id) {
		return td.getById(id);
	}	

	public Trainer UpdateTrainerById(int id, Trainer trainer) {
		  Trainer t=tr.findById(id).get();
		  t.setId(id);
		  t.setName(trainer.getName());
		  t.setAge(trainer.getAge());
		  t.setEmail(trainer.getEmail());
		  return tr.save(t);
		
	}


}
