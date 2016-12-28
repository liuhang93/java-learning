package com.liuhang.decorator;

import org.junit.Test;

/**
 * Created by liuhang on 2016/12/15.
 * 设计模式: 装饰模式. http://blog.csdn.net/janice0529/article/details/44160091
 */
public class DecoratorTest {
    @Test
    public void decoratorTest() {
        Component component, decoratorA;

        component = new ConcreteComponent();
        decoratorA = new ConcreteDecoratorA(component);//对原有具体构件component进行装饰

        component.operation();
        System.out.println("\n装饰一次后:");
        decoratorA.operation();

        System.out.println("\n二次装饰");
        Component decoratorB;
        decoratorB = new ConcreteDecoratorB(decoratorA);// 如果需要对原有构件对象装饰后的decoratorA对象上进行再次装饰
        decoratorB.operation();
    }

}
