package com.liuhang.decorator;

/**
 * Created by liuhang on 2016/12/15.
 * 具体构建类,继承抽象类Component
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("我是具体的构件类,被装饰(增强)的");
    }
}
