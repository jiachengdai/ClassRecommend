package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // 数据库表名
public class User {

    @Id//标注主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示主键值的生成策略是 IDENTITY，常用于 MySQL 的自增主键（即数据库自动生成）。
    private Long id;//对应数据库表中的 id 字段，类型为 Long。

    @Column(nullable = false, unique = true)//：将字段映射为表中的列，并设置：
    //nullable = false：该列不能为空（NOT NULL）
    //unique = true：该列值必须唯一（UNIQUE）
    private String username;

    @Column(nullable = false)
    private String password;

    // Getter 和 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}