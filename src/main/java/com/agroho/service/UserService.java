package com.agroho.service;

import com.agroho.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by rezaul on 5/18/17.
 */

@Service
public interface UserService {

    User getUserByEmail(String email);

    User saveUser(User user);
}
