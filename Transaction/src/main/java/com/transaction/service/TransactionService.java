package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.dao.TransactionDao;
import com.transaction.entity.GooglePay;

@Service
public class TransactionService {
	
	@Autowired
	TransactionDao td;

	public String sendMoney(GooglePay gpay) {
	
		return td.sendMoney(gpay);
	}

}
