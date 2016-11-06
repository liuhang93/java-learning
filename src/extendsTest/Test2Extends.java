package extendsTest;

/**
 * Created by liuhang on 2016/11/1.
 * 1.jvm调用了main方法,mian进栈
 * 2.遇到Zi zi=new Zi(); 将Fu.class和Zi.class先后分别加载进入内存,再创建对象,当Fu.class加载进内存,其静态代码块加载执行
 * 3.走子类的构造方法,先初始化父类,在初始化子类,即先走父类的构造(执行父类构造时,先执行父类的构造代码块)
 */
public class Test2Extends {
    public static void main(String[]args){
        Zi zi=new Zi();
    }
}

class Fu {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public Fu() {
        System.out.println("构造方法Fu");
    }
}

class Zi extends Fu {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Zi() {
        System.out.println("构造方法Zi");
    }
}
