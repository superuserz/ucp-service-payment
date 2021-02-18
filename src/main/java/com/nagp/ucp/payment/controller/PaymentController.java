package com.nagp.ucp.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @GetMapping(value = "/greet")
    public String greet() {
        return "Hi From Payments";
    }
}
