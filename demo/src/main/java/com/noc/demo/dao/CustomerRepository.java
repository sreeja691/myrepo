package com.noc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.noc.demo.entity.CustomerCountInputModel;


public interface CustomerRepository extends JpaRepository < CustomerCountInputModel, Long > {
	@Query("Select count(1) from CustomerCountInputModel where node like :#{#customer.node} and slot = :#{#customer.slot} "
			+ "and PON = :#{#customer.pon}")
    int findCustomerCount(@Param("customer")CustomerCountInputModel customerCountInput);
}
