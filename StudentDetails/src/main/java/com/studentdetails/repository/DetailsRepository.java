package com.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentdetails.entity.Student;

public interface DetailsRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select name from student_details where roll_number like ? ",nativeQuery = true)
	String getNameByRollNo(int rollNumber);

	@Query(value = "select attendance from student_details where roll_number like ? ",nativeQuery = true)
	int getPercentByRollNo(int rollNumber);

}
