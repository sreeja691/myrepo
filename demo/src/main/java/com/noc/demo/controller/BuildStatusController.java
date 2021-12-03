package com.noc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildStatusController {
	
	@RequestMapping(value = "/getBuildStatus", method = RequestMethod.POST)
	public boolean getBuildStatus(@RequestParam("I_DEVICE_CLLI") String nodeName) {
		System.out.println("nodeName" + nodeName);
		boolean buildStatus = false;
		
		return buildStatus;
	}
}
