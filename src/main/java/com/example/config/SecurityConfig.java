package com.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // 允许匿名访问注册和登录接口
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/auth/**").permitAll() // 👈 允许匿名访问 /auth/register 和 /auth/login
                        .anyRequest().authenticated()            // 👈 其他接口需要登录
                )
                // 关闭CSRF（适用于前后端分离或使用Postman测试）
                .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
