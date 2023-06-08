package com.studentmarksheet.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmarksheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {

	@Query(value = "select sem1total from mark_sheet where roll_number like ? ",nativeQuery = true)
	int getSem1TotalByRollNo(int rollNumber);

	
	@Query(value = "select sem2total from mark_sheet where roll_number like ? ",nativeQuery = true)
	int getSem2TotalByRollNo(int rollNumber);


	@Query(value= "select * from mark_sheet where roll_number like ? ",nativeQuery = true)
	MarkSheet getMarkSheetDetailbyRollNo(int rollNumber);




}
