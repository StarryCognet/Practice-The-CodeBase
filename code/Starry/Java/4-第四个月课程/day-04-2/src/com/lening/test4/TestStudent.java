package com.lening.test4;

public class TestStudent {
    public static void main(String[] args) {
        //方法的调用    A类调用B类中的方法，那么需要在A类中先实例化B类的对象，然后B类对象.方法名();
        //实例化Student对象
        Student stu1 = new Student();

        //赋值
        stu1.name = "张三";
        stu1.sex = "男";
        stu1.age = 20;


        //方法
        stu1.show();

        String name = stu1.getName();
        System.out.println(name);

        stu1.setName("李四");              //实参和形参要保证  在  数量、数据类型、位置 上要一一对应

        stu1.show();
    }
}
