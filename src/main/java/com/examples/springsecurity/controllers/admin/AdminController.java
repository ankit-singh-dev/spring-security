package com.examples.springsecurity.controllers.admin;

import com.examples.springsecurity.models.generic.User;
import com.examples.springsecurity.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("suspendCustomer/{customerId}")
    public String suspendCustomer(@PathVariable String customerId){
        return "Customer suspended";
    }

    @PostMapping("createUser")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
