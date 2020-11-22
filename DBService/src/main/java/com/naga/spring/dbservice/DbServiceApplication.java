package com.naga.spring.dbservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DbServiceApplication {

	private Logger log= LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}

}
