package com.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.studentdetails.customexception.AgeException;
import com.studentdetails.entity.Student;
import com.studentdetails.repository.DetailsRepository;


@Repository
public class DetailsDao {

	@Autowired
	DetailsRepository sr;

	
	public String setStudent(Student s) {
		sr.save(s);
		return "saved";
	}
	
	public String setStudents(List<Student> s) {
		sr.saveAll(s);
		return "saved";
	}

	public List<Student> getStudents() {
		return sr.findAll();
	}

	public Student getById(int id) {
		return sr.findById(id).get();
	}

	public String getNameByRollNo(int rollNumber) {
		return sr.getNameByRollNo(rollNumber);
	}

	public int getPercentByRollNo(int rollNumber) {
		return sr.getPercentByRollNo(rollNumber);
	}
	
}
