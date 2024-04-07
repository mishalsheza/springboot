package com.example.springboot.controllers;


import com.example.springboot.models.Product;
import com.example.springboot.services.FakeStoreProductService;
import com.example.springboot.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This controller is for hosting APIs

@RestController

//localhost:8080/products -> connects localhost to product
@RequestMapping("/products")

//product controller acts as  a helper between the services and db
public class ProductController {
        private ProductService productService;

        ProductController (ProductService productService){

            this.productService=productService;
        }
    //localhost:8080/products/10
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        //throw new RuntimeException("Something went wrong");
//        ResponseEntity<Product> responseEntity =null;
//        Product product = null;
//        try {
//            product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//            return responseEntity;
//        }
//        catch (RuntimeException exception) {
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong");
//            ResponseEntity<ExceptionDto> response =
//                    new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
//            return response;
//        }

            return productService.getProductById(id);
        }

        @GetMapping
        public List<Product> getAllProducts () {
            return productService.getAllProducts();
        }


    }

