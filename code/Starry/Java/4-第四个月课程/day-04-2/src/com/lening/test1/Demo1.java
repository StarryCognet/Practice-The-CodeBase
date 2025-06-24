package com.lening.test1;

/**
 * 数组的默认值：
 * int       0
 * double    0.0
 * String    null
 * boolean   false
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "田七"};

        //循环遍历数组
        System.out.println("=================循环遍历数组================");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //查找王五是否存在
        boolean f = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("王五")) {
                f = true;           //王五存在
            }
        }

        if (f) {
            System.out.println("王五存在!");
        } else {
            System.out.println("王五不存在!");
        }

        //查找李四是否存在，如果存在则删除该学生信息，如果不存在，提示不存在
        f = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("李四")) {
                f = true;           //李四存在
                names[i] = null;    //删除该学生
            }
        }

        if (f) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }

        //循环遍历数组
        System.out.println("=================循环遍历数组================");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        //sort升序
        //降序
    }
}
