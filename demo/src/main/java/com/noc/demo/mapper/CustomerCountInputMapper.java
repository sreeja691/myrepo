package com.noc.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.noc.demo.entity.CustomerCountInputModel;
import com.noc.demo.valueobjects.CustomerCountInput;

@Mapper
public interface CustomerCountInputMapper {

	@Mapping(source = "deviceName", target = "node")
	@Mapping(source = "slot", target = "slot")
	@Mapping(source = "pon", target = "pon")
	CustomerCountInputModel convertToModel(CustomerCountInput customerCountInput);
}
