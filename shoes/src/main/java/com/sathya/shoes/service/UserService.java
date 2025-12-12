package com.sathya.shoes.service;

import com.sathya.shoes.model.User;

public interface UserService {
    User login(String username, String password);
}