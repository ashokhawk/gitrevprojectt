package com.studentmarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.studentmarksheet.entity.MarkSheet;
import com.studentmarksheet.repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;

	public String setMarkSheets(List<MarkSheet> m) {
		mr.saveAll(m);
		return "Saved";
	}

	public String setMarkSheet(MarkSheet m) {
		mr.save(m);
		return "Saved";
		
	}

	public List<MarkSheet> getMarkSheets() {
		return mr.findAll();
	}

	public MarkSheet getById(int id) {
		return mr.findById(id).get();
	}

	public int getSem1TotalByRollNo(int rollNumber) {
		return mr.getSem1TotalByRollNo(rollNumber);
	}

	public int getSem2TotalByRollNo(int rollNumber) {
		return mr.getSem2TotalByRollNo(rollNumber);
	}

	public MarkSheet getMarkSheetDetailbyRollNo(int rollNumber) {
		return mr.getMarkSheetDetailbyRollNo(rollNumber);
	}

	

	
}
