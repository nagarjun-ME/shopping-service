package com.naga.spring.orderservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private Logger log= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String sayHello()
    {
        log.info("Inside say Order hello");
        return "Welcome to Order  catalog";
    }
}
