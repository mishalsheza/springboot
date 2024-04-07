package com.example.springboot.dtos;

import lombok.Getter;
import lombok.Setter;

public class Exceptiondto {
    
    @Getter
    @Setter
    
   
        private String message;
        private String resolution;

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }
}

