package com.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.studentmarksheet.dao.MarkSheetDao;
import com.studentmarksheet.entity.MarkSheet;



@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;

	public String setMarkSheets(List<MarkSheet> m) {
		for(MarkSheet x:m) {
			int sem1Total=x.getSem1Practicals()+x.getSem1Theory();
			x.setSem1Total(sem1Total);
			
			int sem2Total=x.getSem2Practicals()+x.getSem2Theory();
			x.setSem2Total(sem2Total);
			
		}
		return md.setMarkSheets(m);
	}

	public String setMarkSheet(MarkSheet m) {
		return md.setMarkSheet(m);
	}

	public List<MarkSheet> getMarkSheets() {	
		return md.getMarkSheets();
	}

	public MarkSheet getById(int id) {
		return md.getById(id);
	}

	public int getSem1TotalByRollNo(int rollNumber) {
		return md.getSem1TotalByRollNo(rollNumber);
	}

	public int getSem2TotalByRollNo(int rollNumber)  {
		return md.getSem2TotalByRollNo(rollNumber); 
	}

	public MarkSheet getMarkSheetDetailbyRollNo(int rollNumber) {
		return md.getMarkSheetDetailbyRollNo(rollNumber);
	}


}

	

	

	


