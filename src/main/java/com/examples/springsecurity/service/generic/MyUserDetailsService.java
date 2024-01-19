package com.examples.springsecurity.service.generic;

import com.examples.springsecurity.models.generic.MyUser;
import com.examples.springsecurity.models.generic.User;
import com.examples.springsecurity.repos.generic.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> principleuser = userRepo.findByUserName(username);
        principleuser.orElseThrow(() -> new UsernameNotFoundException("User doesn't exist"));
        return principleuser.map(MyUser::new).get();
    }
}
