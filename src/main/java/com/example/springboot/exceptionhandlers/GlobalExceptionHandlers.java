package com.example.springboot.exceptionhandlers;

import com.example.springboot.dtos.Exceptiondto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.springboot.exceptions.ProductNotFound;

@ControllerAdvice
public class GlobalExceptionHandlers {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Exceptiondto> handleArithmeticException() {
        Exceptiondto dto = new Exceptiondto();
        dto.setMessage("Something went wrong");
        dto.setResolution("ArithmeticException");
        ResponseEntity<Exceptiondto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
    
}
