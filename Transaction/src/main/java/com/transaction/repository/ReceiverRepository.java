package com.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.entity.Receiver;

public interface ReceiverRepository extends JpaRepository<Receiver, Integer> {



}
