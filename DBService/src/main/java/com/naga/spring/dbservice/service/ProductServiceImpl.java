package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.exception.ProductNotFoundException;
import com.naga.spring.dbservice.jparepository.ProductRepository;
import com.naga.spring.dbservice.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    private Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {

        log.info("Getting all product data");
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {

        log.info("Getting the product data with Product id : " + productId);
       Optional <Product> product=this.productRepository.findById((int)productId);
       if(product.isPresent()){
           return product.get();
       } else  {

           log.error("Something went wrong or product is not available.");
           throw new ProductNotFoundException("Product with ID : "+ productId +" not found. ");
       }

    }
}
