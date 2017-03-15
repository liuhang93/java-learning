package com.liuhang.test;

/**
 * Created by liuhang on 2017/3/15.
 */
public class Test {
    public static void main(String[] args){
        Integer var1=new Integer(1);
        Integer var2=var1;
        doSomething(var2);
        System.out.print(var1.intValue());
        System.out.print(var1==var2);
    }
    public static void doSomething(Integer integer){
        integer=new Integer(2);
    }
}
