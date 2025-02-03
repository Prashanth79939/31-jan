package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.CustRepo;

@Service
public class CustService {
	
	@Autowired
	CustRepo custRepo;

	public void saveAllCustomers(List<Customer> custList) {
		// TODO Auto-generated method stub
		
		custRepo.saveAll(custList);
	}

	public void saveCustomerNewRecord(Customer custData) {
		// TODO Auto-generated method stub
		custRepo.save(custData);
	}

	
}
