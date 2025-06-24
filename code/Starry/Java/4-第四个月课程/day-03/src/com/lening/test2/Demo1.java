package com.lening.test2;

public class Demo1 {
    public static void main(String[] args) {
        //声明数组
        //数据类型[] 数组名 = new 数据类型[数组长度];
        //数据类型 数组名[] = new 数据类型[数组长度];

        //声明数组的时候必须要给数组长度
        String[] names = new String[5];
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "赵六";
        names[4] = "田七";
        //names[5] = "小明";          //数组下标越界

        int ages[] = new int[5];
        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 12;
        ages[3] = 22;
        ages[4] = 14;


        System.out.println(names[0]);

        System.out.println("=============循环遍历数组================");
        System.out.println("=====普通for循环====");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(names[i]);
        }

        System.out.println("=======foreach循环=======");
        /*
        * for(数据类型 变量名:数组名){
        *
        * }
        * */
        for (String name : names) {
            System.out.println(name);
        }
    }
}
