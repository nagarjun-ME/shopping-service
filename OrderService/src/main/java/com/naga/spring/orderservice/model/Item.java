package com.naga.spring.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String itemId;
    private String itemName;
    private int quantity;
    private double totalPrice;
    private List<Product> productList;
}
