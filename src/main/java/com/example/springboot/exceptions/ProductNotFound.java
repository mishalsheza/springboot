package com.example.springboot.exceptions;

import lombok.Getter;
import lombok.Setter;
public class ProductNotFound extends RuntimeException {


    @Getter
    @Setter

    private Long id;

    public ProductNotFound(Long id, String message) {
        super(message);
        this.id = id;
    }

}