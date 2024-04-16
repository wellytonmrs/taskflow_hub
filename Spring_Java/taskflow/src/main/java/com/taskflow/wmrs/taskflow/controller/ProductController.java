package com.taskflow.wmrs.taskflow.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String list(){
        return "Listing all products";
    }

    @PostMapping
    public String create(){
        return "Product Created";
    }

}
