package com.lening.test2;

/**
 * 双重循环： 外层循环执行一次，内层循环执行一圈
 *      打印图形： 外层循环控制行数，内层循环控制列数
 */
public class Demo5 {
    public static void main(String[] args) {
        /*
                            i               j
            *               1               1
            **              2               2
            ***             3               3
            ****            4               4
            *****           5               5
            j <= i
         */

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
