package com.cg.xyzBank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.xyzBank.model.Customer;


public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}
