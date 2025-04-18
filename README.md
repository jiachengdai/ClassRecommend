

## 项目参与人员
|成员|昵称 | 身份|
|--|--|--|
| 李承烨 |planut |开发|
| 刘国宇 |GodCrane |开发|
| 郭岩峰|tonygyf |开发|
| 代佳诚 |jiachengdai|开发|

## 项目结构
spring boot 项目中项目框架已经搭建完毕，项目结构如下：

```bash
> src/main/java
└── org.example
    ├── ComeOnClassApplication.java     // 启动类
    ├── controller                      // 控制器层（对外接口）
    ├── service                         // 业务逻辑层
    ├── service.impl                    // 业务实现类（可选）
    ├── entity                          // 实体类（数据库中的一张表对应一个类）
    ├── repository                      // 数据访问层（也叫dao/mapper）
    └── config                          // 配置类

```

## 环境说明
apache-maven-3.9.6
SDK 21
MySQL 8.0.x


我的settings.xml,可做参考

```bash
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                              http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <localRepository>D:\Code\MavenRepo</localRepository>
        <mirrors>
        <mirror>
            <id>aliyun</id>
            <mirrorOf>central</mirrorOf>
            <name>阿里云</name>
            <url>https://maven.aliyun.com/repository/public</url>
        </mirror>
        <mirror>
            <id>tencent</id>
            <mirrorOf>central</mirrorOf>
            <name>腾讯云</name>
            <url>https://mirrors.cloud.tencent.com/nexus/repository/maven-public/</url>
        </mirror>
    </mirrors>

    <servers>
        <!--
        <server>
            <id>your-server-id</id>
            <username>user</username>
            <password>password</password>
        </server>
        -->
    </servers>

    <profiles>
        <!--
        <profile>
            <id>your-profile</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <url>http://your.repo.url/repository/maven-public/</url>
                </repository>
            </repositories>
        </profile>
        -->
    </profiles>

    <activeProfiles>
        <!-- <activeProfile>your-profile</activeProfile> -->
    </activeProfiles>
</settings>
> 
```




