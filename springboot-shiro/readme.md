springboot-shiro

- 导入依赖
```xml
<dependency>
	<groupId>org.apache.shiro</groupId>
	<artifactId>shiro-spring</artifactId>
	<version>1.4.0</version>
</dependency>
```

- 生成权限、角色、用户的类和dao文件
- 编写shiro拦截器需要配置的是
    - 登录的URL
    - 不拦截的URL
    - 比粗拦截的URL
    - 退出的URL

- 编写自定义的realm
     - 一般继承AuthorizingRealm然后重写
     - doGetAuthenticationInfo  //授权方法
     - doGetAuthenticationInfo //验证登录信息方法

- 编写登录异常controller
 