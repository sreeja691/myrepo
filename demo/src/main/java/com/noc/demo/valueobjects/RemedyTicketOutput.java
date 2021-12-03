package com.noc.demo.valueobjects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemedyTicketOutput {
	@JsonProperty("TT_CREATED")
	private boolean isRecordCreated;
}
