package com.cg.xyzBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.xyzBank.model.Customer;
import com.cg.xyzBank.model.Transaction;
import com.cg.xyzBank.service.ICustomerServiceImpl;
import com.cg.xyzBank.service.ITransactionService;

@RestController
@RequestMapping("customers")
public class CustomerController {

	int currentCustomerId;
	@Autowired
	private ICustomerServiceImpl customerService;
	
	@Autowired
	private ITransactionService transactionService;

	@PostMapping("/add")
	public ModelAndView addCustomer(@RequestParam String name, @RequestParam String username,
			@RequestParam String password) {

		Customer customer = new Customer();
		customer.setName(name);
		customer.setUsername(username);
		customer.setPassword(password);
		customerService.add(customer);
		ModelAndView modelAndView = new ModelAndView("addCustomer");
		return modelAndView;
	}

	@PostMapping("/login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		ModelAndView modelAndView;
		Customer customer = customerService.getCustomerByUsernameAndPassword(username, password);

		if (customer != null) {
			currentCustomerId = customer.getAccountNumber();
			//currentCustomerId = temp1;
			modelAndView = new ModelAndView("home");
			modelAndView.addObject("CUSTOMER", customer);
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("index");
			return modelAndView;
		}

	}

	@GetMapping("/balance")
	public ModelAndView showbalance() {
		ModelAndView modelAndView;
		Customer customer = customerService.findId(currentCustomerId);
		modelAndView = new ModelAndView("showbalance");
		modelAndView.addObject("CUSTOMER", customer);

		return modelAndView;
	}

	@GetMapping("/deposit")
	public ModelAndView deposit(@RequestParam double deposit) {
		ModelAndView modelAndView;
		Customer customer = customerService.findId(currentCustomerId);
		double oldBalance = customer.getBalance();
		double newBalance = deposit + oldBalance;
		customer.setBalance(newBalance);
		customerService.add(customer);
		
		Transaction transaction = new Transaction();
		transaction.setAmount(deposit);
		transaction.setType("DEPOSITED");
		transaction.setAccountNumber(currentCustomerId);
		transaction.setCustomer(customer);
		transactionService.add(transaction);
		modelAndView = new ModelAndView("showbalance");
		modelAndView.addObject("CUSTOMER", customer);
		return modelAndView;

	}

	@GetMapping("/withdraw")
	public ModelAndView withdraw(@RequestParam double withdraw) {
		ModelAndView modelAndView;
		Customer customer = customerService.findId(currentCustomerId);
		double oldBalance = customer.getBalance();
		
		if (oldBalance < withdraw) {
			modelAndView = new ModelAndView("error");
			return modelAndView;
		}
		else {
			
		double newBalance = oldBalance - withdraw;
		customer.setBalance(newBalance);
		customerService.add(customer);
		
		Transaction transaction = new Transaction();
		transaction.setAmount(withdraw);
		transaction.setType("WITHDRAWN");
		transaction.setAccountNumber(currentCustomerId);
		transaction.setCustomer(customer);
		transactionService.add(transaction);
		
		modelAndView = new ModelAndView("showbalance");
		modelAndView.addObject("CUSTOMER", customer);
		}
		return modelAndView;

	}

	@GetMapping("/fundTransfer")
	public ModelAndView fundTransfer(@RequestParam int id, @RequestParam double credit) {
		ModelAndView modelAndView;
		
		Customer sender = customerService.findId(currentCustomerId);
		double oldBalance = sender.getBalance();
		double newBalance = oldBalance - credit;
		sender.setBalance(newBalance);
		customerService.add(sender);
		
		Transaction sendertransaction = new Transaction();
		sendertransaction.setAmount(credit);
		sendertransaction.setType("DEBITED");
		sendertransaction.setAccountNumber(currentCustomerId);
		sendertransaction.setCustomer(sender);
		transactionService.add(sendertransaction); 

		Customer reciver = customerService.findId(id);
		double oldBalance1 = reciver.getBalance();
		double newBalance1 = oldBalance1 + credit;
		reciver.setBalance(newBalance1);
		customerService.add(reciver);
		
		Transaction recivertransaction = new Transaction();
		recivertransaction.setAmount(credit);
		recivertransaction.setType("CREIDTED");
		recivertransaction.setAccountNumber(currentCustomerId);
		recivertransaction.setCustomer(reciver);
		transactionService.add(recivertransaction);
		
		modelAndView = new ModelAndView("fundTransferInfo");
		modelAndView.addObject("SENDER", sender);
		modelAndView.addObject("RECIVER", reciver);
		return modelAndView;

	}
	
	@GetMapping("/showTransaction")
	public ModelAndView showTransaction() {
		
		List<Transaction> transactionsList = transactionService.findByCustomerAccountNumber(currentCustomerId);
		ModelAndView modelAndView = new ModelAndView("printTransaction");
		modelAndView.addObject("TRANSACTIONSLIST", transactionsList);
		return modelAndView;
	}
	
	}
	

