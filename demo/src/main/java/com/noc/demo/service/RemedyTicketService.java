package com.noc.demo.service;

import com.noc.demo.valueobjects.RemedyTicketInput;
import com.noc.demo.valueobjects.RemedyTicketOutput;

public interface RemedyTicketService {

	public RemedyTicketOutput createRemedyTicket(RemedyTicketInput remedyTicketInput);
}
