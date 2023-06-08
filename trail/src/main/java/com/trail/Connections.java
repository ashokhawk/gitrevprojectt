package com.trail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class Connections {

	@RequestMapping(value = "/getString")
	public String getHello() {
		return "HelloWorld";

	}

	@RequestMapping(value = "/getName")
	public String getName() {
		return "Ashok";
	}

	@RequestMapping(value = "/getGreet/{name}")
	public String greet(@PathVariable String name) {
		return name;
	}

	@RequestMapping(value = "/getBioData/{name}/{age}")
	public String getBioData(@PathVariable String name, @PathVariable int age) {
		return "name is " + name + ", " + "age is " + age;
	}

	@RequestMapping(value = "/getAdd/{num1}/{num2}")
	public String getAdd(@PathVariable int num1, @PathVariable int num2) {
		return "Addition is " + (num1 + num2);
	}

	@RequestMapping(value = "/getOddOrEven/{num1}")
	public String getAdd(@PathVariable int num1) {
		if (num1 % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

	@RequestMapping(value = "/getPrime/{number}")
	public String getPrime(@PathVariable("number") int num) {

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			return "It is Prime Number";
		} else {
			return "It is not";
		}
	}

	@GetMapping(value = "check")
	public String check(@RequestParam String userName, @RequestParam String password) {
		if (userName.equals("Ashok") && password.equals("Trunks")) {
			return "Valid Person";
		}

		else {
			return "Invalid person";
		}
	}

	@RequestMapping(value = "/getCar")
	public Car getCar(@RequestBody Car c) {
		return c;
	}

	@RequestMapping(value = "/getCarr")
	public List<Car> getCar(@RequestBody List<Car> c) {
		return c;
	}

	@RequestMapping(value = "/bikePrice")
	public List<Bike> getDetails(@RequestBody List<Bike> bb) {
		for (Bike b : bb) {
			b.setPrice(b.getPrice() * 2);

		}
		return bb;
	}

	@RequestMapping(value = "/max")
	public int getMaxx(@RequestParam List<Integer> bb) {
		int max = 0;
		for (Integer b : bb) {
			if (b >= max) {
				max = b;
			}
		}
		return max;
	}


	@RequestMapping(value="/maxlength/{a}/{b}/{c}/{d}/{e}")
	public String findMaxLength(@PathVariable String a,@PathVariable String b,@PathVariable String c,@PathVariable String d, @PathVariable String e) {    
	String[] words= {a,b,c,d,e};
	String max=words[0];
	for(String x:words) {
		if(x.length()>max.length()) {
			max=x;
		}
	}
	return max;
	}


	@RequestMapping(value="/getEven/{a}/{b}/{c}/{d}/{e}")
	public List<Integer> findNoOfEven(@PathVariable int a,@PathVariable int b,@PathVariable int c,@PathVariable int d, @PathVariable int e) {
	int[] num= {a,b,c,d,e};
	List<Integer> n=new ArrayList<>();
	for(Integer x : num) {
		if(x%2==0) {
			n.add(x);
		}
	}
	return n;
	
}
}
