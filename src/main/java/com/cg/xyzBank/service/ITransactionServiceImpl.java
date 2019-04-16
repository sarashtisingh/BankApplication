package com.cg.xyzBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.xyzBank.dao.ITransactionDao;
import com.cg.xyzBank.model.Transaction;

@Service("transactionService")
public class ITransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private ITransactionDao transactionDao;

	@Override
	public void add(Transaction transaction) {
		transactionDao.save(transaction);
	}

	@Override
	public List<Transaction> findByCustomerAccountNumber(Integer customerId) {
		List<Transaction> list = transactionDao.findByCustomerAccountNumber(customerId);
		return list;
	}



}
