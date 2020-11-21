package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}
