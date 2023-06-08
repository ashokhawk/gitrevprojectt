package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.entity.GooglePay;
import com.transaction.service.TransactionService;

import jakarta.transaction.Transactional;

@RestController
@Transactional
public class TransactionController {
@Autowired
TransactionService ts;
	
	
	@PostMapping("/setSender") 
		public String sendMoney(@RequestBody GooglePay gpay) {
			return ts.sendMoney(gpay);
		}
	}
	

