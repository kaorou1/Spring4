package com.kaorou.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {

    public static void main(String[] args) {
        //test01();
        //test02();
        test03();
    }

    /**
     * 最简单的面向接口编程
     */
    public static void test01() {
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.save();
    }

    /**
     * 将对象交给spring管理，降低代码的耦合
     */
    public static void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao.save();
    }

    /**
     * 提供set方法进行依赖注入
     */
    public static void test03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
