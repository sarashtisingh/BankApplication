package com.cg.xyzBank.service;

import com.cg.xyzBank.model.Customer;

public interface ICustomerService {

	public void add(Customer customer);

	Customer getCustomerByUsernameAndPassword(String username, String password);

	Customer findId(Integer id);

}
