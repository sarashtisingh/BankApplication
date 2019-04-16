package com.cg.xyzBank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANS_SEQ")
    @SequenceGenerator(sequenceName = "transaction_seq", allocationSize = 1, name = "TRANS_SEQ")
	
	private int transactionId;
	private int accountNumber;
	private String type;
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

}
