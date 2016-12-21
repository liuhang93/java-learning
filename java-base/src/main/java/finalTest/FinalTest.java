package finalTest;

/**
 * Created by liuhang on 2016/11/1.
 * final关键字测试
 */
/*
final:最终
*/
public class FinalTest {
    public static void main(String[]args){
        final int num=10;
//        num=20;
        System.out.println(num);
        final Person p=new Person("张三",23);
//        p=new Person("李四",11);
        System.out.println(p);

        p.setName("张四");
        p.setAge(24);
    }
}
class Person{
    private String name;
    private int age;
    final int num=0;//这里必须初始化

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
