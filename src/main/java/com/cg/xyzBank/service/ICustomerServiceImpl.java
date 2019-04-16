package com.cg.xyzBank.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.xyzBank.dao.ICustomerDao;
import com.cg.xyzBank.model.Customer;

@Service("customerService")
public class ICustomerServiceImpl implements ICustomerService {
	
	@Autowired 
	private ICustomerDao customerdao;
	@Autowired
	private EntityManager em;
	
	@Override
	public void add(Customer customer) {
		customerdao.save(customer);		
	}
	
	@Override
	public Customer getCustomerByUsernameAndPassword(String username, String password) {
		
		String qstr = "Select customer from Customer customer where username=:pusername and password=:ppassword";
		TypedQuery<Customer> query = em.createQuery(qstr, Customer.class);
		query.setParameter("pusername", username);
		query.setParameter("ppassword", password);
		Customer customer = query.getSingleResult();
		return customer;
	}
	
	@Override
	public Customer findId(Integer id) {
		Customer customer = customerdao.findById(id).get();
		return customer;
	}
	
}
