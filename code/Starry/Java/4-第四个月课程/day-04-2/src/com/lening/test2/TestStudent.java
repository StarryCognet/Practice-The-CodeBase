package com.lening.test2;

public class TestStudent {
    public static void main(String[] args) {
        //实例化对象
        Student stu = new Student();
        //对象名.属性名
        System.out.println(stu.name);
        System.out.println(stu.sex);
        System.out.println(stu.age);

        //赋值
        stu.name = "张三";
        stu.sex = "男";
        stu.age = 20;

        System.out.println(stu.name);
        System.out.println(stu.sex);
        System.out.println(stu.age);

        //对象名.方法名();
        stu.eat();
        stu.show();
    }
}
