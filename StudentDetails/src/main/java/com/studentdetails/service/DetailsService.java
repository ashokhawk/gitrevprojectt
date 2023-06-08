package com.studentdetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.studentdetails.customexception.AgeException;
import com.studentdetails.dao.DetailsDao;
import com.studentdetails.entity.Student;

@Service
public class DetailsService {

	@Autowired
	DetailsDao sd;

	
	public String setStudent(Student s) {
		return sd.setStudent(s);
	}
	
	@ExceptionHandler(AgeException.class)
	public String setStudents(List<Student> s) throws AgeException {
		List<Student> z=s.stream().filter(x->x.getAge()<18).collect(Collectors.toList());
		
		if(z.isEmpty()) {
			return sd.setStudents(s);
		}
		else {
			throw new AgeException("Your age is too low");
		}
		
		
	}

	public List<Student> getStudents() {
		return sd.getStudents();
	}

	public Student getById(int id) {
		return sd.getById(id);
	}

	public String getNameByRollNo(int rollNumber) {
		return sd.getNameByRollNo(rollNumber);
	}

	public int getPercentByRollNo(int rollNumber) {
		return sd.getPercentByRollNo(rollNumber);
	}

	

	
	
	
}
