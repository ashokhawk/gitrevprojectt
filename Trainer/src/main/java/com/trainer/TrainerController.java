package com.trainer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TrainerController {
//FieldBasedInjection
//	@Autowired
//	TrainerService ts;
	
//SetterInjection	
//	public TrainerService ts; 
//	@Autowired
//	public void setTrainerService(TrainerService ts) {
//		this.ts=ts;
//	}
	
//Constructor Injection	
public TrainerService ts;
@Autowired
public TrainerController(TrainerService ts) {//ts=tsl
	this.ts=ts;//if this.ts=tsl         tsl.settrainers(trainers)
}
	
	@PostMapping(value = "/setTrainers")
	public String setTrainers(@RequestBody List<Trainer> trainers) {
		return ts.setTrainers(trainers);
	}
	
	@GetMapping(value = "/getTrainers")
	public List<Trainer> getTrainers() {
		return ts.getTrainers();
	}

	
	@PutMapping(value = "/getTrainerById/{id}")
	public Trainer UpdateTrainerById(@PathVariable int id,@RequestBody Trainer trainer) {
		return ts.UpdateTrainerById(id,trainer);
	}
	
	
	
}