package com.naga.spring.paymentservice.controller;

import com.naga.spring.paymentservice.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;


@RestController
@RequestMapping("/shop/pay")
public class PaymentRestController {

    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String defaultPaymentMessage()
    {
        return "Welcome to Payment System!!!";
    }

    @GetMapping("/{pId}")
    public ResponseEntity<Payment> getItemList(@PathVariable("pId") long pId)
    {
        //RestTemplate restTemplate=new RestTemplate();
        log.info("Payment details id  " + pId+ " retrieving");

        return ResponseEntity.ok().body(new Payment(1, "Test Items", 4.44, new Date(), "Test001" ));
    }


    @RequestMapping("/all")
    public ResponseEntity <Payment>  getAllItems()
    {
        RestTemplate restTemplate=new RestTemplate();
        log.info("Retrieving all payments details");

        //ResponseEntity <Payment[] > productResponse=restTemplate.getForEntity("http://localhost:8400/db/products/all", Payment[].class);


        return ResponseEntity.ok().body(new Payment(1, "Test Items", 4.44, new Date(), "Test001" ));
    }


}
