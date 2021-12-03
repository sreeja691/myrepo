package com.noc.demo.mapper;

import org.mapstruct.Mapper;

import com.noc.demo.entity.RemedyTicketModel;
import com.noc.demo.valueobjects.RemedyTicketInput;

@Mapper
public interface RemedyTicketInputMapper {

	public RemedyTicketModel convertToModel(RemedyTicketInput remedyTicketInput);
}
