# springboot模板

1. excel表格提交测试

### 整合mybatis

- 引入jar

```xml
<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.3.0</version>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>8.0.12</scope>
		</dependency>

		<dependency>
			<groupId>com.github.pagehelper</groupId>
			<artifactId>pagehelper</artifactId>
			<version>5.1.8</version>
		</dependency>
```
- 在application.propertoes中配置连接池

```properties
#配置mybatis
mybatis.config-location=classpath:mybatis-config.xml
mybatis.mapper-locations=classpath:mapper/**/*.xml
mybatis.type-aliases-package=com.yang.**.bean

# datasource
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/ucsc4dev?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=admin
# Hikari will use the above plus the following to setup connection pooling
spring.datasource.type=com.zaxxer.hikari.HikariDataSource
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=25
spring.datasource.hikari.auto-commit=true
spring.datasource.hikari.idle-timeout=30000
spring.datasource.hikari.pool-name=HikariCP
spring.datasource.hikari.max-lifetime=1800000
spring.datasource.hikari.connection-timeout=30000
spring.datasource.hikari.connection-test-query=SELECT 1

spring.http.encoding.charset=UTF-8
spring.jackson.time-zone=GMT+08

```

- 编写mybatis核心配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" 
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
	<plugins>
		<plugin interceptor="com.github.pagehelper.PageInterceptor">
			<property name="helperDialect" value="mysql"/>
			<property name="reasonable" value="true"/>
			<property name="supportMethodsArguments" value="true"/>
			<property name="params" value="count=countSql"/>
		</plugin>
	</plugins>
</configuration>

```

- 通过注解形式执行sql

```java
package com.yang.springboottest.mapper;

import com.yang.springboottest.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findByName(@Param("id") Integer id);

    @Insert("INSERT INTO USER(phone) VALUES(#{phone})")
    int insert(@Param("phone") String phone);

}
```

- 通过xml配置sql

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.yang.springboottest.mapper.CompanyMapper">
    
    <select id="selectCompalyById" parameterType="com.yang.springboottest.bean.Company" resultType="com.yang.springboottest.bean.Company">
        SELECT id, company_name as companyName FROM company WHERE id = #{company.id}
    </select>
</mapper>
```
- 如果不在dao层上面加注解那么就在入口类上加上
@MapperScan("com.utry.**.dao")