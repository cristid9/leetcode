package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
public class ExceptionControllerAdvice {

//    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionNotEnoughMoneyHandler() {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Incorrect call");
    }

}
