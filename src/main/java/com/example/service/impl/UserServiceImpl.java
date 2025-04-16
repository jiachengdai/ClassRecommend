package com.example.service.impl;


import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Autowired 用于自动注入依赖的 UserRepository。
//
//@Service 表示当前类是一个服务类，会被 Spring 容器管理，供其他类使用。
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//密码加密
@Service//标记为一个 Spring 服务组件
public class UserServiceImpl implements UserService {

    @Autowired//自动注入Repository，用于访问数据库
    private UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public boolean register(String username, String password) {
        if (userRepository.findByUsername(username).isPresent()) {
            return false; // 用户已存在
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password)); // 重点改造：加密
        userRepository.save(user);
        return true;
    }

    @Override
    public User login(String username, String password) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        //查询用户信息，封装为 Optional，避免空指针。
        if (userOpt.isPresent() && passwordEncoder.matches(password, userOpt.get().getPassword())) {
            return userOpt.get();
        }
        return null;
    }
}
