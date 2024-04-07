package com.example.springboot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String image;
}
