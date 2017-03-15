package com.liuhang.factoryModel;

import org.junit.Test;

/**
 * Created by liuhang on 2017/2/17.
 * 测试简单工厂模式
 */
public class EasyFactoryModelTest {
    @Test
    public void testEasyFactoryModel() throws Exception {
        Car car = Driver.getCar("Benz");
        car.drive();
    }
}
