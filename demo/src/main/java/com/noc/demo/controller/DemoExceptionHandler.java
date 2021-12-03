/*
 * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO DISH AND MAY NOT
 * BE REPRODUCED PUBLISHED OR DISCLOSED TO OTHERS WITHOUT ITS AUTHORIZATION.
 *
 * Copyright © 2019. DISH.
 *
 * All Rights Reserved. DISH is a trademark or registered trademarks of DISH or
 * its affiliates in the U.S. and other countries. Other names may be trademarks of their
 * respective owners.
 */
package com.noc.demo.controller;

import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;
import com.noc.demo.exception.NotFoundException;
import com.noc.demo.exception.SocketTimeoutException;
import com.noc.demo.exception.ValidationException;

/**
 * @author IBM
 *	
 */

@ControllerAdvice
public class DemoExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(DemoExceptionHandler.class);

	/**
	 * This method returns Error response
	 * 
	 * @param ex
	 * @return ResponseEntity<Object>
	 */
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleServerException(Exception ex) {
		logger.error("Invalid Input Exception: ", ex);
		
		return new ResponseEntity<Object>( HttpStatus.SERVICE_UNAVAILABLE);
	}

	/**
	 * This method returns Error response
	 * 
	 * @param ex
	 * @return ResponseEntity<Object>
	 */
	@ExceptionHandler(value = { ValidationException.class })
	public ResponseEntity<Object> handleValidationException(Exception ex) {
		logger.error("Invalid Input Exception: ", ex);
		
		return new ResponseEntity<Object>( HttpStatus.BAD_REQUEST);
	}
	


	/**
	 * This method returns Error response
	 * 
	 * @param ex
	 * @return ResponseEntity<Object>
	 */
	@ExceptionHandler(value = { NotFoundException.class })
	public ResponseEntity<Object> handleNotFoundException(Exception ex) {
		
		return new ResponseEntity<Object>( HttpStatus.NOT_FOUND);
	}
	
	/**
	 * This method returns Error response
	 * 
	 * @param ex
	 * @return ResponseEntity<Object>
	 */
	@ExceptionHandler(value = { SocketTimeoutException.class , ResourceAccessException.class , UnknownHostException.class})
	public ResponseEntity<Object> handleTimeoutException(Exception ex) {
		
		return new ResponseEntity<Object>( HttpStatus.SERVICE_UNAVAILABLE);
	}

	/**
	 * This method returns Error response
	 *
	 * @param ex
	 * @return ResponseEntity<Object>
	 */
	
}
