package com.naga.spring.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    //@SequenceGenerator(name = "sequenceGenerator")
    private long productId;

    @Column(name ="productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productPrice")
    private double productPrice;

    public Product( ){

    }

    public Product(String productName, String productDescription, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
