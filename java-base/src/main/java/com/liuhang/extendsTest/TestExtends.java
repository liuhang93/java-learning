package com.liuhang.extendsTest;

/**
 * Created by liuhang on 2016/10/24.
 */
public class TestExtends {
    public static void main(String[] args) {
        Son s1 = new Son(11, "s1");
        Son s2 = new Son(12, "s2");
        System.out.println(s1.getName() + "-" + s1.getAge());
        System.out.println(s2.getName() + "-" + s2.getAge());
    }
}

class Father {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

class Son extends Father {
    public Son(int age, String name) {
        super(age, name);
    }


}
class Son2 extends Father{
    public Son2(int age, String name) {
        super(age, name);
    }
}