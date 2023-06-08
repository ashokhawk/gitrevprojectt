package com.studentresult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

	@Autowired
	ResultDao rd;

	
	public String setOverAll(List<Result> res) {		
		return rd.setOverAll(res);
	}
}
