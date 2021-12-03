package com.noc.demo.service.impl;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.noc.demo.dao.RemedyTicketRepository;
import com.noc.demo.entity.RemedyTicketModel;
import com.noc.demo.mapper.RemedyTicketInputMapper;
import com.noc.demo.service.RemedyTicketService;
import com.noc.demo.valueobjects.RemedyTicketInput;
import com.noc.demo.valueobjects.RemedyTicketOutput;

@Component
public class RemedyTicketServiceImpl implements RemedyTicketService {

	private final RemedyTicketRepository remedyTicketRepository;
	
	private RemedyTicketInputMapper remedyTicketInputMapper = Mappers.getMapper(RemedyTicketInputMapper.class);
	
	public RemedyTicketServiceImpl(RemedyTicketRepository remedyTicketRepository) {
		super();

		this.remedyTicketRepository = remedyTicketRepository;
	}
	@Override
	public RemedyTicketOutput createRemedyTicket(RemedyTicketInput remedyTicketInput) {
		
		RemedyTicketModel result = remedyTicketRepository.save(remedyTicketInputMapper.convertToModel(remedyTicketInput));
		RemedyTicketOutput remedyTicketOutput = new RemedyTicketOutput();
		if(result!=null) {
			remedyTicketOutput.setRecordCreated(true); 
		}else {
			remedyTicketOutput.setRecordCreated(false); 
		}

		return remedyTicketOutput;

	}

}
