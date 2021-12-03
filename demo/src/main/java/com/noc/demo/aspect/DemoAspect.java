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
package com.noc.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author IBM
 *
 */
@Aspect
@Configuration
public class DemoAspect {

	private static final Logger logger = LoggerFactory.getLogger(DemoAspect.class);
	
	/**
	 * This method returns Object(execution time for each methods
	 * 
	 * @param joinPoint
	 * @return Object
	 */
	@Around("execution(public * com.noc.demo.controller.*.*(..)) || execution(public * com.noc.demo.service.*.*(..))") 
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info(joinPoint.getSignature() + " start");

		long start = System.currentTimeMillis();

		Object proceed = joinPoint.proceed();

		long executionTime = System.currentTimeMillis() - start;

		logger.info(joinPoint.getSignature() + " end");
		logger.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");
		return proceed;
	}

}
