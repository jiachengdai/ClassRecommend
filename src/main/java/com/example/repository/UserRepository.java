package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//这是 Spring Data JPA 提供的一个通用的 Repository 接口，内置了很多基本的数据库操作方法（比如增删改查）。
import java.util.Optional;
//导入 Optional 类，用于防止返回值为空时出现空指针异常（NullPointerException）。
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // 用于登录查找用户名字
}