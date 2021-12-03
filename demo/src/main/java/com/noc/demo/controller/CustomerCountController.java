package com.noc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noc.demo.service.CustomerCountService;
import com.noc.demo.valueobjects.CustomerCountInput;
import com.noc.demo.valueobjects.CustomerCountOutput;

@RestController
public class CustomerCountController {
	
	@Autowired
	private CustomerCountService customerCountService;
	
	@PostMapping("/getCustomerCount")
	public ResponseEntity<CustomerCountOutput> getCustomerCount(@RequestBody CustomerCountInput customerCountInput) throws Exception{
		return new ResponseEntity<CustomerCountOutput>(customerCountService.getCustomerCount(customerCountInput), HttpStatus.OK) ;
		
	}
	

}
