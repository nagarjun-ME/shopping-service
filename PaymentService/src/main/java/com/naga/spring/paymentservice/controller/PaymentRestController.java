package com.naga.spring.paymentservice.controller;

import com.naga.spring.paymentservice.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/naga/shop/pay")
public class PaymentRestController {

    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/")
    public String defaultPaymentMessage()
    {
        return "Welcome to Payment System!!!";
    }

    @GetMapping("/{pId}")
    public ResponseEntity<Payment> getItemList(@PathVariable("pId") long pId)
    {
        //Down*
        // RestTemplate restTemplate=new RestTemplate();
        log.info("Payment details id  " + pId+ " retrieving");

        return ResponseEntity.ok().body(new Payment(1, "Test Items", 4.44, new Date(), "Test001" ));
    }


    @GetMapping("/all")
    public ResponseEntity <List <Payment>>  getAllItems()
    {

        log.info("Retrieving all payments details");

       // ResponseEntity <Payment[] > productResponse=restTemplate.getForEntity("http://shopping-db-service/db/products/all", Payment[].class);

        ResponseEntity <List<Payment>> paymentResponse;
        paymentResponse = webClientBuilder.build()
                                                    .get()
                                                    .uri("http://SHOPPING-DB-SERVICE/db/pay/all")
                                                    .retrieve()
                                                    .toEntityList(Payment.class)
                                                    .block();

        return ResponseEntity.ok().body(paymentResponse.getBody());
    }


}
