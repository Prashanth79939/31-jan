package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustService;


   @RestController
   public class CustController {
	   
	   @Autowired
	   CustService custService;
	  @PostMapping("/stpeters/college/customer/add") 
		public String addNewCustomer(@RequestBody Customer custData){  
			
			
			custService.saveCustomerNewRecord(custData);
			
			return "successfully added new record----->";
			
		}
		@PostMapping("/stpeters/college/customer/add/all")
		public String addNewCustomer(@RequestBody List<Customer> custList){
			
			
			Object custList1;
			custService.saveAllCustomers(custList);
			
			return "successfully added all records----->";
			
		}

	}
 
