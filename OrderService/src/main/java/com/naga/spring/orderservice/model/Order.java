package com.naga.spring.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order{

    private String orderId;
    private String orderStatus;
    private String orderDate ;
    //private String itemId;
    private List <Item> itemList;
    private String customerId;


}
