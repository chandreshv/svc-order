package com.chandresh.order.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "products")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("This is a dummy response");
    }
}
