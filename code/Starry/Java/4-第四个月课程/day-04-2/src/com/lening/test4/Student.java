package com.lening.test4;

/**
 * 学生信息实体类
 */
public class Student {

    String name;
    String sex;
    int age;


    //有返回值   没有返回值
    //有参方法   无参方法

    //有参有返回值的方法   无参有返回值的方法
    //有参无返回值      无参无返回值的方法

    /*
     * 访问修饰符  返回值类型  方法名(){
     *
     * }
     *
     * void  表示  方法没有返回值
     * return 来返回数据
     * return 后面返回的数据的类型要和方法的返回值类型保持一致
     * */

    /**
     * 展示学生信息
     */
    public void show() {
        System.out.println("姓名:" + this.name + ",性别:" + this.sex + ",年龄:" + this.age);
    }

    /**
     * 获取姓名
     * @return
     */
    public String getName(){
        return this.name;
    }


    //参数
    public void setName(String name){
        this.name = name;
    }
}
