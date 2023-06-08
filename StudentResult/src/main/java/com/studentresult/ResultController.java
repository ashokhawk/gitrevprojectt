package com.studentresult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {

	@Autowired
	ResultService rs;
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/getTotalDetails")
	public List<Result> getOverAll() {
	String url1="http://localhost:8080/getStudents";
	String url3="http://localhost:8081/getSem1TotalByRollNo/";
	String url4="http://localhost:8081/getSem2TotalByRollNo/";
	String url5="http://localhost:8080/getPercentByRollNo/";
	
	ResponseEntity<List<Result>> r=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<Result>> (){});
	List<Result> res=r.getBody();
	
	
	res.forEach(y->{
		
		int h=y.getRollNumber();
		ResponseEntity<Integer> tot1=rt.exchange(url3+h,HttpMethod.GET, null, Integer.class);
		int sem1=tot1.getBody();
		ResponseEntity<Integer> tot2=rt.exchange(url4+h, HttpMethod.GET,null,Integer.class);
		int sem2=tot2.getBody();
		int tot=sem1+sem2;
		
		ResponseEntity<Integer> attendance=rt.exchange(url5+h,HttpMethod.GET, null,Integer.class);
		int att=attendance.getBody();
		if(att>90)
		{
			int total=tot/2;
			int mark=total+5;
			if(mark<100)
			{
			y.setTotalMarks(mark);
			int per=tot*100/200; 
			y.setPercentage(per);
			}	
			}
		else {	
			int total2=tot/2;
			y.setTotalMarks(total2);
			int per=tot*100/200;
			y.setPercentage(per);
		}});
	return res;
	
	}	
	
	@PostMapping("/setTotalDetails")
	public String setOverAll() {
	String url1="http://localhost:8080/getStudents";
	String url3="http://localhost:8081/getSem1TotalByRollNo/";
	String url4="http://localhost:8081/getSem2TotalByRollNo/";
	String url5="http://localhost:8080/getPercentByRollNo/";
	
	ResponseEntity<List<Result>> r=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<Result>> (){});
	List<Result> res=r.getBody();
	
	
	res.forEach(y->{
		
		int h=y.getRollNumber();
		ResponseEntity<Integer> tot1=rt.exchange(url3+h,HttpMethod.GET, null, Integer.class);
		int sem1=tot1.getBody();
		ResponseEntity<Integer> tot2=rt.exchange(url4+h, HttpMethod.GET,null,Integer.class);
		int sem2=tot2.getBody();
		int tot=sem1+sem2;
		
		ResponseEntity<Integer> attendance=rt.exchange(url5+h,HttpMethod.GET, null,Integer.class);
		int att=attendance.getBody();
		if(att>90)
		{
			int total=tot/2;
			int mark=total+5;
			if(mark<100)
			{
			y.setTotalMarks(mark);
			int per=tot*100/200; 
			y.setPercentage(per);
			}	
			}
		else {	
			int total2=tot/2;
			y.setTotalMarks(total2);
			int per=tot*100/200;
			y.setPercentage(per);
		}});
	return rs.setOverAll(res);
	
	}	
}

