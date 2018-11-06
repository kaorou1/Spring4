package com.kaorou.spring;

public class Employee {
    private String ename;
    private Car car;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", car=" + car +
                '}';
    }
}
