package polymorphic;

/**
 * Created by liuhang on 2016/11/7.
 * 多态中成员访问: 成员方法
 * 成员方法:编译看左边(父类),运行看右边(子类). 即  动态绑定.
 * 编译时,看父类有没有print方法,保证编译通过,运行时,调用子类的print方法,子类的方法进栈.
 */
public class PolymorphicDemo3 {
    public static void main(String[]args){
        Father f=new Son();
        f.print();
        f.method();
        Father.method();
    }

}

