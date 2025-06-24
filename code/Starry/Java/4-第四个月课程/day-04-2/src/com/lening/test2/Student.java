package com.lening.test2;

/**
 * 学生信息实体类
 *
 * 全局变量和局部变量的区别:
 * 作用域：全局变量是供整个类所使用    局部变量只能够在声明它的方法的内部使用
 * 初始值：全局变量有默认值    局部变量没有初始值
 *
 *
 * 全局变量和局部变量是可以同名的，但是局部变量具有更高的优先级，就近原则
 */
public class Student {

    //定义属性部分
    String name;
    String sex;
    int age;

    //定义方法部分
    /**
     * 吃饭
     */
    public void eat() {
        System.out.println(this.name + "正在吃饭!");
    }

    /**
     * 展示信息
     */
    public void show() {
        String address;
        System.out.println("姓名:" + this.name + ",性别:" + this.sex + ",年龄:" + this.age);
    }
}
