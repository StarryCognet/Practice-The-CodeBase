package com.lening.test1;

public class Demo1 {
    public static void main(String[] args) {
        /*
        * 输出所有的”水仙花数”，并统计”水仙花数”共有多少个。
          所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
          举例：153就是一个水仙花数。
          153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
        * */
        int count = 0;      //计数
        for (int i = 100; i < 1000; i++) {
            //个位
            int ge = i % 10;
            //十位
            int shi = i / 10 % 10;
            //百位
            int bai = i / 100;

            int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;

            if(sum == i){
                //水仙花数
                System.out.println(i);
                count++;
            }
        }

        System.out.println("水仙花数的个数:"+count);
    }
}
