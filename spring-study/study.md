## bean配置头
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/aop
        http://www.springframework.org/schema/aop/spring-aop.xsd">

    <context:annotation-config/>
</beans>
```
##自动配置
````xml
<context:annotation-config/>
````

##注解说明
-@Autowired 自动装配通过类型，名字。
    如果@Autowired不唯一自动装配 需要通过@Qualifier(value = "xxx")
-@Nullable 字段标记这个注解，说明这个字段可以为null
-@Resource 自动装配通过名字，类型。
-@Component 组件 放在类上 等价于<bean id="user" class="com.yang.pojo.User"/>
    等价的几个注解 都是将某个类注册到spring容器中
    -dao @Repository
    -controller @Controller
    -service @Service
-@Value("样洋")  给属性添加参数
-@Scope("prototype") 单例
