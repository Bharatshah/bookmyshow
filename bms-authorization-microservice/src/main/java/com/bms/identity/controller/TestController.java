package com.bms.identity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping({ "/hello" })
	//@RolesAllowed("ROLE_EDITOR")
	public String firstPage() {
		return "Hello World";
	}

}