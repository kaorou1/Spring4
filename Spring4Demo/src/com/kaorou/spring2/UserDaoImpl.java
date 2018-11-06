package com.kaorou.spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//相当于<bean id="userDao" class="com.kaorou.spring2.UserDaoImpl" />
//@Component("userDao")
@Repository("userDao")
//@Service
//@Controller
public class UserDaoImpl implements UserDao {

    //使用注解方式进行属性注入，不需要提供set方法
    @Value("kaorou")
    private String name;


    @Override
    public void save() {
        System.out.println("UserDaoImpl方法执行了" + name);
    }
}
