package com.lening.test2;

/**
 * 字符串类
 */
public class Demo1 {

    public static void main(String[] args) {
        //创建字符串
        String str = "张三";
        String str2 = new String("李四");

        //获取字符串长度
        System.out.println(str.length());

        //== 和 equals()的区别:

        //concat();   +
        String a = "姓名:";
        String newStr = a.concat(str).concat(",年龄:").concat("20");
        System.out.println(newStr);

        // indexOf();       获取子字符串在目标字符串中第一次出现的位置      如果不存在该字符串，则返回-1
        // lastIndexOf();       获取子字符串在目标字符串中最后一次出现的位置      如果不存在该字符串，则返回-1

        String str3 = "hello world!!!";
        String str4 = str3.substring(2,4);            // substring(index);          从index位置开始截取，截取到最后
        System.out.println(str4);                     // substring(index1,index2);  从index1的位置截取到index2-1的位置    不包括结束位置


        String str5 = "          hello    world       ";
        System.out.println(str5.trim());            //trim();       取出字符串前后的空格

        String str6 = "长亭外 古道边 芳草碧连天 晚风拂 柳笛声残 夕阳山外山";
        String[] strs = str6.split(" ");        // + . ? * 转义   双斜杠

        for (String s : strs) {
            System.out.println(s);
        }
    }
}
