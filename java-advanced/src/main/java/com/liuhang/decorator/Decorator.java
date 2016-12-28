package com.liuhang.decorator;

/**
 * Created by liuhang on 2016/12/15.
 * 作用:引入抽象构件类， 给具体构件类增加职责，但是具体职责在其子类中实现
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //调用原有业务方法
        component.operation();
    }

}
