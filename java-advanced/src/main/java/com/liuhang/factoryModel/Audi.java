package com.liuhang.factoryModel;

/**
 * Created by liuhang on 2017/2/17.
 * Audi奥迪类
 */
public class Audi extends Car {
    public Audi() {
        System.out.println("Create an Audi");
    }

    @Override
    void drive() {
        System.out.println("Audi start engine");
    }
}
