package com.bms.booking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class TestController {

	@RequestMapping({ "/hello" })
	@RolesAllowed("ROLE_EDITOR")
	public String firstPage() {
		return "Hello World";
	}

}