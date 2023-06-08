package com.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transaction.entity.GooglePay;
import com.transaction.repository.ReceiverRepository;
import com.transaction.repository.SenderRepository;

import jakarta.transaction.Transactional;

@Repository

public class TransactionDao {
	@Autowired
	ReceiverRepository rr;
	@Autowired
	SenderRepository sr;

	
	public String sendMoney(GooglePay gpay) {
		sr.save(gpay.getSender());
		int num=10/0;
		rr.save(gpay.getReceiver());
		return "saved";
		
	}
	

}
