package com.lening.test1;

/**
 * 常量：一成不变的量
 * final 关键字修饰的变量   叫做常量
 * 常量不能二次赋值
 * 常量的名字全部大写
 */
public class Demo2 {
    public static void main(String[] args) {
        final String NAME = "张三";
        System.out.println(NAME);
        //name = "李四";            //常量不允许二次赋值
        System.out.println(NAME);
    }
}
