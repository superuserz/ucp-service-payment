package com.nagp.ucp.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

	@GetMapping(value = "/greet")
	public String greet() {
		return "Hi From Payments";
	}
}
