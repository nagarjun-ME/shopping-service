package com.naga.spring.dbservice.restcontroller;

import com.naga.spring.dbservice.model.Product;
import com.naga.spring.dbservice.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db/products/")
public class ProductRestController {

    private Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public ResponseEntity <List <Product>> readAllProducts()
    {
        log.info("Inside read all products ");
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @RequestMapping(value="/{pId}", method = RequestMethod.GET)
    public ResponseEntity<Product> getProductbyId(@PathVariable("pId") long id)
    {
        log.info(" Finding product with id :" + id);
        return ResponseEntity.ok().body(productService.getProductById(id));
    }

}
