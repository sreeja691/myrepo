package com.noc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "customer_count")
public class CustomerCountInputModel {

	@Column(name="node")
	private String node;
	@Column(name="slot")
	private String slot;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
	@Column(name="pon")
	private String pon;
	@Column(name="ttv")
	private String ttv;
	@Column(name="unknown_a")
	private String unknownA;
	@Column(name="ttv_business")
	private String ttvBusiness;
	@Column(name="ttv_consumer")
	private String ttvConsumer;
	@Column(name="hsia_consumer")
	private String hsiaConsumer;
	@Column(name="hsia_business")
	private String hsiaBusiness;
	@Column(name="wifi_public")
	private String wifiPublic;
	@Column(name="nghp")
	private String nghp;

	
	
}
