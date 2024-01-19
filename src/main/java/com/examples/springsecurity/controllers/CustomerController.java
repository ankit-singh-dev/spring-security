package com.examples.springsecurity.controllers;

import com.examples.springsecurity.models.Customer;
import com.examples.springsecurity.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("findAll")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

}
