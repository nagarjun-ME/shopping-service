package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.jparepository.ProductRepository;
import com.naga.spring.dbservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {

        Optional <Product> product=this.productRepository.findById(productId);
        return null;
    }
}
