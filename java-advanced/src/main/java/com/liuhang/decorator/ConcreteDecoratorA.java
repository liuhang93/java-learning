package com.liuhang.decorator;

/**
 * Created by liuhang on 2016/12/15.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
    private void addedBehavior(){
        System.out.println("我是具体的装饰类A，我可以增强原有对象方法");
    }
}
