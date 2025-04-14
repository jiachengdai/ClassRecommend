
|成员|昵称 | 身份|
|--|--|--|
| 李承烨 |李承烨 |管理|
| 朱晔炯 |znnn1234 |开发|
| 王梓芊|zikinx |开发|
| 方银英 | |开发|
| 蔡子阳| |开发|

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




