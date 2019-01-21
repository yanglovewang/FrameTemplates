# 手写spring小demo

---
### 模拟ioc

1. 创建一个BeanFactory模拟IOC容器，创建时注册spring提供给用户的bean
    1. List<BeanDefined> beanDefinedList;
    2. Map<String ,Object> SpringIoc;  //已经创建好实例对象
    3. 
2. 创建一个BeanDifined描述被IOC容器管理的bean

设计模式+反射+默认规则
动态工厂，每一个bean加载的时候设定该bean的工厂，通过工厂加载该bean

