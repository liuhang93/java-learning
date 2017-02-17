package com.liuhang.factoryModel;

/**
 * Created by liuhang on 2017/2/17.
 * Bmw宝马类
 */
public class Bmw extends Car{
    @Override
    void drive() {
        System.out.println("Create a Bmw");
    }

    public Bmw() {
        System.out.println("Bmw start engine");
    }
}
