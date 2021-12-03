package com.noc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noc.demo.service.RemedyTicketService;
import com.noc.demo.valueobjects.RemedyTicketInput;
import com.noc.demo.valueobjects.RemedyTicketOutput;

@RestController
public class RemedyTicketController {
	@Autowired
	private RemedyTicketService remedyTicketService;
	
	@PostMapping("/createRemedyTT")
	public ResponseEntity<RemedyTicketOutput> createRemedyTicket(@RequestBody RemedyTicketInput remedyTicketInput){
		return new ResponseEntity<RemedyTicketOutput>(remedyTicketService.createRemedyTicket(remedyTicketInput), HttpStatus.OK);
	}
}
