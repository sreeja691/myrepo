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
package com.noc.demo.exception;

public class SocketTimeoutException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SocketTimeoutException(String exception) {
        super(exception);
    }

}
