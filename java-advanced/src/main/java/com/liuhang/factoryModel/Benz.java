package com.liuhang.factoryModel;

/**
 * Created by liuhang on 2017/2/17.
 * Benz奔驰类
 */
public class Benz extends Car {
    public Benz() {
        System.out.println("Create a Benz");
    }

    @Override
    void drive() {
        System.out.println("Benz start engine");
    }
}
