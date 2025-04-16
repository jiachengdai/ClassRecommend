package com.example.service;

import com.example.entity.User;
public interface UserService {
    boolean register(String username, String password);
    User login(String username, String password);
}
