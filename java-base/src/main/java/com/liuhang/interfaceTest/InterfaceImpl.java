package com.liuhang.interfaceTest;

/**
 * Created by liuhang on 2017/3/12.
 * All interface methods must be declared as public when implemented in a class.
 * 实现接口时，所有的接口方法必须被申明为public；
 */
public class InterfaceImpl implements Interface {
    @Override
    public void fun() {
        System.out.print("haha");
    }
}
class Test extends InterfaceImpl implements Interface{

}