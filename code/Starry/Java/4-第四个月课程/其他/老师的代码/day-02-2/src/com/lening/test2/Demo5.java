package com.lening.test2;

/**
 * 双重循环： 外层循环执行一次，内层循环执行一圈
 * 打印图形： 外层循环控制行数，内层循环控制列数
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

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
                                i                   j
         *   *                  1                   1
         *   ***                2                   3
         *   *****              3                   5
         *   *******            4                   7
         *   *********          5                   9
             j <= 2 * i - 1
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


          /*
                                       i          k         j
            *   ####*                  1          4         1
            *   ###***                 2          3         3
            *   ##*****                3          2         5
            *   #*******               4          1         7
            *   *********              5          0         9
               *    j <= 2 * i - 1     # k = 5 - i;
         */
        System.out.println("===========正等腰三角形===========");
        for (int i = 1; i <= 5; i++) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        System.out.println("===========倒等腰三角形===========");
        for (int i = 5; i >= 1; i--) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        System.out.println("===========菱形===========");
        for (int i = 1; i <= 5; i++) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        for (int i = 4; i >= 1; i--) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        System.out.println("===========沙漏===========");
        for (int i = 5; i >= 1; i--) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        for (int i = 2; i <= 5; i++) {
            //先打#号
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            //再打*号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();           //换行
        }

        System.out.println("===========九九乘法表============");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) +"\t");
            }
            System.out.println();
        }
    }
}
