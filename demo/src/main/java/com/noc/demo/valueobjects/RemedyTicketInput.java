package com.noc.demo.valueobjects;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemedyTicketInput {

	@NotBlank
	private String inMessageName;
	@NotBlank
	private String inSourceSystemGUID;
	@NotBlank
	private String inSourceSystemName;
	@NotBlank
	private String inTargetSystemName;
	@NotBlank
	private String inElementID;
	@NotBlank
	private String inEventDate;
	@NotBlank
	private String inActProKey;
	@NotBlank
	private String inAdditionalText;
	@NotBlank
	private String inAlarmID;
	@NotBlank
	private String inSummary;
	@NotBlank
	private String submitter;
	
}
