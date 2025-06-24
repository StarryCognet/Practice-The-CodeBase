package com.ww.demo;

public class Students {
    String name;
    Integer age;
    double gao;

    public void sc() {
        System.out.println("学生名：" + name + ",岁数：" + age + ",身高：" + gao);
        for (int i = 0; i < 10; i++) {
            age++;
            System.out.println(age);
        }
    }
}
