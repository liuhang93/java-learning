package polymorphic;

/**
 * Created by liuhang on 2016/11/7.
 * 多态中成员变量访问特点
 * 成员变量:编译看左边(父类),运行看左边(父类)
 */
public class PolymorphicDemo2 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.num);//输出10
        Son s = new Son();
        System.out.println(s.num);//输出20
    }
}

class Father {
    int num = 10;

    public void print() {
        System.out.println("father");
    }

    public static void method() {
        System.out.println("father static method");
    }
}

class Son extends Father {
    int num = 20;

    @Override
    public void print() {
        System.out.println("son");
    }

    public static void method() {
        System.out.println("son static method");
    }

}