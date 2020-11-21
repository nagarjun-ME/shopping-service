package com.naga.spring.paymentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/shop/pay")
public class PaymentRestController {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String defaultPaymentMessage()
    {
        return "Welcome to Payment System!!!";
    }
}
