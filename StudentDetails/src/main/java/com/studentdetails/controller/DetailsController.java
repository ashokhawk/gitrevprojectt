package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetails.customexception.AgeException;
import com.studentdetails.entity.Student;
import com.studentdetails.service.DetailsService;

@RestController
public class DetailsController {
	
	@Autowired
	DetailsService ss;
	
	@PostMapping(value="/setStudent")
	public String setStudent(@RequestBody List<Student> s) throws AgeException {
		return ss.setStudents(s);
	}
	
	@PostMapping(value="/setStudents")
	public String setStudents(@RequestBody List<Student> s) throws AgeException {
		return ss.setStudents(s);
	}
	
	
	@GetMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return ss.getStudents();
	}
	
	@GetMapping(value = "/getById/{id}")
	public Student getById(@PathVariable int id) {
		return ss.getById(id);
	}
	
	@GetMapping(value = "/getNameByRollNo/{rollNumber}")
	public String getNameByRollNo(@PathVariable int rollNumber) {
		return ss.getNameByRollNo(rollNumber);
	}
	@GetMapping(value = "/getPercentByRollNo/{rollNumber}")
	public int getPercentByRollNo(@PathVariable int rollNumber) {
		return ss.getPercentByRollNo(rollNumber);

	}

}
