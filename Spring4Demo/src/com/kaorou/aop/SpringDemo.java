package com.kaorou.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class SpringDemo {

    private static final int NUM = 2;


    public static void main(String[] args) {
        test();
    }

    public static void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao aopUserDao = (UserDao) applicationContext.getBean("aopUserDao");
        aopUserDao.save();
        aopUserDao.delete();
        aopUserDao.find();
        aopUserDao.update();


        String[] arr = {"xinye", "kaorou", "wanbo"};

        //iter
        for (String s : arr) {
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer integer : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public static void test2() {
        List<String> list = new ArrayList<>();

        //ifn
        if (list == null) {
            
        }

        //inn
        if (list != null) {
            
        }
    }
}
