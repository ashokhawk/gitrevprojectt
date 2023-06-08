package com.studentresult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ResultDao {

	@Autowired
	ResultRepository rr;

	public String setResult(List<Result> results) {
		rr.saveAll(results);
		return "saved";
	}

	public String setOverAll(List<Result> res) {
		return setOverAll(res);
	}
}
