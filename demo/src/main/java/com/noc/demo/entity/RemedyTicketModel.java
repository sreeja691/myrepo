package com.noc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name="REMEDY_TT")
public class RemedyTicketModel {

	@Column(name="IN_MESSAGE_NAME",nullable=false)
	private String inMessageName;
	@Column(name="IN_SOURCE_SYSTEM_GUID",nullable=false)
	private String inSourceSystemGUID;
	@Column(name="IN_SOURCE_SYSTEM_NAME",nullable=false)
	private String inSourceSystemName;
	@Column(name="IN_TARGET_SYSTEM_NAME",nullable=false)
	private String inTargetSystemName;
	@Column(name="IN_ELEMENT_ID",nullable=false)
	@Id
	private String inElementID;
	@Column(name="IN_EVENT_DATE",nullable=false)
	private String inEventDate;
	@Column(name="IN_ACT_PRO_KEY",nullable=false)
	private String inActProKey;
	@Column(name="INA_ADDITIONAL_TEXT",nullable=false)
	private String inAdditionalText;
	@Column(name="IN_ALARM_ID",nullable=false)
	private String inAlarmID;
	@Column(name="IN_SUMMARY",nullable=false)
	private String inSummary;
	@Column(name="SUBMITTER",nullable=false)
	private String submitter;
}
