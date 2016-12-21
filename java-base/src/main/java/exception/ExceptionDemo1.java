package exception;

/**
 * Created by liuhang on 2016/11/8.
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws Exception {
        Person person=new Person();
        person.setAge(155);//上面throws给虚拟机处理
        try{
            person.setAge(-11);//函数抛出了异常,则一定要处理 catch一下,或者继续throws
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

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

    public void setAge(int age) throws Exception{
        if (age > 0 && age < 150) {
            this.age = age;
        }else{
            Exception e= new Exception("age is illegal");
            throw e; //抛出了异常,则要在函数声明上标明有异常
        }
    }
}
