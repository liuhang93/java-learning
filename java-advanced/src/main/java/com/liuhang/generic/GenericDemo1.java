package com.liuhang.generic;

/**
 * Created by liuhang on 2017/3/10.
 * 泛型通配符
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        Info<String> info = new Info<>();
        info.setVar("hahaha");
        fun(info);

        Info<Integer> integerInfo = new Info<>();
        integerInfo.setVar(3);
        fun(integerInfo);
    }

    public static void fun(Info<?> temp) {//可以接受任何泛型对象
        System.out.println("内容" + temp);
    }
}

class Info<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }
}
