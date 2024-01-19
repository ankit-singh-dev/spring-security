package com.examples.springsecurity.controllers;

import com.examples.springsecurity.models.Order;
import com.examples.springsecurity.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("findAll")
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    @PostMapping("create")
    public Order create(@RequestBody Order order){
        return orderRepo.save(order);
    }
}
