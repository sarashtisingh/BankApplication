package com.cg.xyzBank.service;

import java.util.List;

import com.cg.xyzBank.model.Transaction;

public interface ITransactionService {
	

public void add(Transaction transaction);
public List<Transaction> findByCustomerAccountNumber(Integer customerId);

}
