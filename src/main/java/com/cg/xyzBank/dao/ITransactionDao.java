package com.cg.xyzBank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.xyzBank.model.Transaction;

public interface ITransactionDao extends JpaRepository<Transaction, Integer>{
	
	public List<Transaction> findByCustomerAccountNumber(Integer id);

}
