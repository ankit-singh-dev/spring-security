package com.examples.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("suspendCustomer/{customerId}")
    public String suspendCustomer(@PathVariable String customerId){
        return "Customer suspended";
    }

}
