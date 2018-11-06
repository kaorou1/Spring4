package com.kaorou.spring;

public class CustomerDaoImpl implements CustomerDao{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("CustomerDaoImpl执行了..." + name);
    }
}
