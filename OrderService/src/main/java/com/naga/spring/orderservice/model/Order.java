package com.naga.spring.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@NoArgsConstructor
@ToString
public class Order{

    private String orderId;
    private String orderStatus;
    private String orderDate ;
    //private String itemId;
    private List <Item> itemList;
    private String customerId;


    public Order(String orderId, String orderStatus, String orderDate, List<Item> itemList, String customerId) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.itemList = itemList;
        this.customerId = customerId;
    }
}
