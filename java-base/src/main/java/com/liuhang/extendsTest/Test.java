package com.liuhang.extendsTest;
class Student{
    static {
        System.out.println("Student静态代码块");
    }
    {
        System.out.println("Student构造代码块");
    }
    public Student(){
        System.out.println("Student构造方法");
    }
}
class StudentTest{
    static {
        System.out.println("StudentTest静态代码块");
    }
    public static void main(String[]args){
        System.out.println("我是main方法");
        Student s1=new Student();
        Student s2=new Student();

    }
}