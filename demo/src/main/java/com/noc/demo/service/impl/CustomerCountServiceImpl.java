package com.noc.demo.service.impl;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.noc.demo.dao.CustomerRepository;
import com.noc.demo.mapper.CustomerCountInputMapper;
import com.noc.demo.service.CustomerCountService;
import com.noc.demo.valueobjects.CustomerCountInput;
import com.noc.demo.valueobjects.CustomerCountOutput;

@Component
public class CustomerCountServiceImpl implements CustomerCountService {
	
	private final CustomerRepository customerRepository;

	public CustomerCountServiceImpl(CustomerRepository customerRepository) {
		super();

		this.customerRepository = customerRepository;
	}

	
	
	private CustomerCountInputMapper customerCountInputMapper = Mappers.getMapper(CustomerCountInputMapper.class);
	 
	@Override
	public CustomerCountOutput getCustomerCount(CustomerCountInput customerCountInput) {
		int count = customerRepository.findCustomerCount(customerCountInputMapper.convertToModel(customerCountInput));
		CustomerCountOutput customerCountOutput = new CustomerCountOutput();
		customerCountOutput.setCustomerCount(count);
		return customerCountOutput;
		
	}

}
