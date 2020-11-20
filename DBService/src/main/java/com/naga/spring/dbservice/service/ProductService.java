package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();

    Product getProductById(long productId);
}
