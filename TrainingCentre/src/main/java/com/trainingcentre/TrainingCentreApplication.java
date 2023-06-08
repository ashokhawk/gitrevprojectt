package com.trainingcentre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingCentreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrainingCentreApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		
		Student std1=context.getBean(Student.class);	
		System.out.println(std1);
		std1.setName("Ashok");
		System.out.println(std1);
		
		Student std2=context.getBean(Student.class);	
		System.out.println(std2);
	}
}
