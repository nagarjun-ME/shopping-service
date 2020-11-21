package com.naga.spring.dbservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{

    private Logger log= LoggerFactory.getLogger(this.getClass());

    private  static final  long serialVersion= 1L;

    public ProductNotFoundException(String errorMessage)
    {
        super(errorMessage);
        log.error(errorMessage);

    }

    public ProductNotFoundException(String errorMessage, Throwable throwable)
    {
        super(errorMessage, throwable);
        log.error(errorMessage);
    }
}
