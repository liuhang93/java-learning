package com.liuhang.factoryModel;

/**
 * Created by liuhang on 2017/2/17.
 * Car工厂类
 */
public class Driver {
    public static Car getCar(String type) throws Exception {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Bmw")) {
            return new Bmw();
        } else if (type.equals("Benz")) {
            return new Benz();
        } else {
            throw new Exception();
        }
    }
}
