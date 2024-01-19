package com.examples.springsecurity.repos.generic;

import com.examples.springsecurity.models.generic.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {

    Optional<User> findByUserName(String userName);

}
