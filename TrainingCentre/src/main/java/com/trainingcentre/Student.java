package com.trainingcentre;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton")
public class Student {

	private String name;

	public Student() {
		System.out.println("this is student class");
	}
	
	@Value("mani")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}	
}
