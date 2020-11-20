package com.naga.spring.dbservice.jparepository;

import com.naga.spring.dbservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
