package com.agroho.service;

import com.agroho.domain.Role;
import com.agroho.domain.User;
import com.agroho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by rezaul on 5/18/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {

        bCryptPasswordEncoder.encode(user.getPassword());
        user.setActive(true);
        user.setRoles(Arrays.asList(Role.ROLE_USER.getRoleLabel()));
        return userRepository.saveAndFlush(user);
    }
}
