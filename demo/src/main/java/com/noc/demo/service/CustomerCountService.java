package com.noc.demo.service;

import com.noc.demo.valueobjects.CustomerCountInput;
import com.noc.demo.valueobjects.CustomerCountOutput;

public interface CustomerCountService {
	
	public CustomerCountOutput getCustomerCount(CustomerCountInput customerCountInput);

}
