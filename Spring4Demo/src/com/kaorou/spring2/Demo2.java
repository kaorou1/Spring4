package com.kaorou.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
    public static void main(String[] args) {
        //test01();
        //test02();
        test03();
    }

    public static void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

    /**
     * 测试bean的常用注解，类管理，属性注入，作用范围
     */
    public static void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");

        System.out.println(userService1 + "=======" +userService2);
        userService1.save();

    }

    /**
     * 测试bean的生命周期的注解方式
     */
    public static void test03() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        ServiceTest service = (ServiceTest) applicationContext.getBean("service");
        service.service();
        applicationContext.close();
    }
}
