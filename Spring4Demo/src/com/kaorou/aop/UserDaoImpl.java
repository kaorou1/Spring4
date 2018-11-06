package com.kaorou.aop;

import org.springframework.stereotype.Repository;

@Repository("aopUserDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("用户保存....");
    }


    @Override
    public void update() {
        System.out.println("用户更新....");
    }

    @Override
    public void delete() {
        System.out.println("用户删除....");
    }

    @Override
    public void find() {
        System.out.println("用户查找....");
    }
}
