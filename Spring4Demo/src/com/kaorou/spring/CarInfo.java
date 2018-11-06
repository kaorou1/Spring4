package com.kaorou.spring;

public class CarInfo {
    //private String name;

    public String getName() {
        return "三轮";
    }

    public Double randomPrice() {
        return Math.random() * 3000;
    }
}
