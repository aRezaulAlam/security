package com.agroho.config;

import com.agroho.domain.User;
import com.agroho.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by rezaul on 5/17/17.
 */
@Service
public class CustomeUserDetailsService implements UserDetailsService{

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        User user = userService.getUserByEmail(email);

        if (email == null) {
            throw new UsernameNotFoundException("No user found with this CMED ID " + email);
        }

        return user;
    }
}
