package com.naga.spring.orderservice.service;



import com.naga.spring.orderservice.model.Item;
import com.naga.spring.orderservice.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/naga/shop/order/")
public class OrderController {

    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String sayHello()
    {
        log.info("Test message");
        return "Welcome to Order  catalog";
    }

    @GetMapping("/all")
    public ResponseEntity <Order> getAllOrders()
    {

        log.info("Retrieving all Item details");

        //ResponseEntity <Item[] > productResponse=restTemplate.getForEntity("http://localhost:8200/naga/shop/item/all", Item[].class);

        ResponseEntity <List<Item>> productResponse=webClientBuilder.build()
                .get()
                .uri("http://item-catalog-service/naga/shop/item/all")
                .retrieve()
                .toEntityList(Item.class)
                .block();
        log.info("Retrieving all Items completed.");

        String dt=new Date().toString();
        return ResponseEntity.ok().body(new Order("001ABC", "Recieved",dt, productResponse.getBody(), "TestUser001"));

    }
}
