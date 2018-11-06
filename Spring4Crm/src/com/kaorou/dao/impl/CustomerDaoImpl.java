package com.kaorou.dao.impl;

import com.kaorou.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("CustomerDaoImpl执行了...");
    }
}
