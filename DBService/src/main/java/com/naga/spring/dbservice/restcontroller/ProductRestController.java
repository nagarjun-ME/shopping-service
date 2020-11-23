package com.naga.spring.dbservice.restcontroller;

import com.naga.spring.dbservice.model.Product;
import com.naga.spring.dbservice.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;

import java.util.List;

@RestController
@RequestMapping("/db/products/")
public class ProductRestController {

    private final  Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @HystrixCommand
    @RequestMapping("/all")
    public ResponseEntity <List <Product>> readAllProducts()
    {
        log.info("Inside read all products ");
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @HystrixCommand
    @RequestMapping(value="/{pId}", method = RequestMethod.GET)
    public ResponseEntity<Product> getProductById(@PathVariable("pId") long id)
    {
        log.info(" Finding product with id :" + id);
        return ResponseEntity.ok().body(productService.getProductById(id));
    }

    @HystrixCommand
    @PostMapping("/add")
    public ResponseEntity < Product > createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }

    @HystrixCommand
    @PutMapping("/edit/{id}")
    public ResponseEntity < Product > updateProduct(@PathVariable long id, @RequestBody Product product) {
        product.setProductId(id);
        return ResponseEntity.ok().body(this.productService.updateProduct(product));
    }

    @HystrixCommand
    @DeleteMapping("/rmv/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        this.productService.deleteProduct(id);
        return HttpStatus.OK;
    }

}
