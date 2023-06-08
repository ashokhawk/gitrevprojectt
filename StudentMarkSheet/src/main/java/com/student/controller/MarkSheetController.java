package com.student.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.MarkSheetService;
import com.studentmarksheet.entity.MarkSheet;

@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;
	
	@PostMapping(value = "/setMarkSheets")
	public String setMarkSheets(@RequestBody List<MarkSheet> m) {
		return ms.setMarkSheets(m);
	}
	
	@PostMapping(value="/setMarkSheet")
	public String setStudent(@RequestBody MarkSheet m) {
		return ms.setMarkSheet(m);
	}

	@GetMapping(value = "/getById/{id}")
	public MarkSheet getById(@PathVariable int id) {
		return ms.getById(id);
	}
	
	@GetMapping(value="/getMarkSheets")
	public List<MarkSheet> getMarkSheets() {
		return ms.getMarkSheets();
	}
	
	@GetMapping(value="/getSem2TotalByRollNo/{rollNumber}")
	public int getSem2ByRollNo(@PathVariable int rollNumber) {
		return ms.getSem2TotalByRollNo(rollNumber);	
	}
	
	@GetMapping(value ="/getSem1TotalByRollNo/{rollNumber}")
	public int getSem1TotalByRollNo(@PathVariable int rollNumber) {
		return ms.getSem1TotalByRollNo(rollNumber);
	}
	
	@GetMapping(value="/getMarkSheetDetailByRollNo/{rollNumber}")
	public MarkSheet getMarkSheetDetailbyRollNo(@PathVariable int rollNumber) {
		return ms.getMarkSheetDetailbyRollNo(rollNumber);
	}
	
	
}

	


