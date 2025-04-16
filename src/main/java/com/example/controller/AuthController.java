package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;//服务层接口
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//意味着该类中的方法返回的对象会被自动转化为 JSON 格式。
@RequestMapping("/auth")
public class AuthController {

    @Autowired//自动注入 UserService，这样可以在控制器中调用 userService 提供的注册和登录方法。
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        boolean success = userService.register(username, password);
        return success ? "注册成功" : "用户名已存在";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        User user = userService.login(username, password);
        return user != null ? "登录成功" : "用户名或密码错误";
    }
}
