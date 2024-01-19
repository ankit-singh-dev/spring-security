package com.examples.springsecurity.service;

import com.examples.springsecurity.models.generic.User;
import com.examples.springsecurity.repos.generic.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private UserRepo userRepo;

    public String createUser(User user){
        userRepo.save(user);
        return "User created successfully";
    }

}
