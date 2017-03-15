package com.liuhang.decorator;

/**
 * Created by liuhang on 2016/12/15.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedAnotherBehavior();
    }

    private void addedAnotherBehavior() {
        System.out.println("我是具体的装饰类B，我可以增强原有对象方法");
    }
}
