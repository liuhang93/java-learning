package polymorphic;

/**
 * Created by liuhang on 2016/11/7.
 * polymorphic 概述: 事物存在的多种形态
 * 多态前提: 要有继承关系;要有方法重写;要有父类引用指向子类对象
 */
public class PolymorphicDemo1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "blue");//蓝猫
        Dog dog = new Dog("Jack", "black");//黑狗
        Bird bird = new Bird("Rose");
        Lady lady1 = new Lady("Harry", cat);//父类引用指向子类对象
        Lady lady2 = new Lady("Marry", dog);
        Lady lady3 = new Lady("Dacy", bird);
        lady1.myPetEnjoy();//实际调用的是子类对象的enjoy方法
        lady2.myPetEnjoy();
        lady3.myPetEnjoy();
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void enjoy() {
        System.out.println("动物享受中...");
    }
}

class Cat extends Animal {
    private String eyesColor;

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    @Override
    public void enjoy() {
        System.out.println("养的猫享受中...喵...");
    }
}

class Dog extends Animal {
    private String furColor;

    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void enjoy() {
        System.out.println("养的狗享受中...汪...");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void enjoy() {
        System.out.println("养的鸟享受中...叽..");
    }
}

class Lady {
    private String name;
    private Animal pet;

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void myPetEnjoy() {
        pet.enjoy();
    }
}

