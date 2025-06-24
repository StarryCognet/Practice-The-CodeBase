package com.lening.ti;

import java.util.Scanner;

public class TFhuiYuan {
    public static void main(String[] args) {
//    首先在结账之前，需要先判断是否是会员，如果是会员，
//    则依照会员的处理，需要判断购物是否满200元；
//    如果不是会员，则按照普通顾客处理，普通顾客要看购物是否满足100元，
//    如果满足，则打九折；如果不满足，则不打折。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入是否是会员：是（y）/否（其他字符）");
        String tf = input.next();
        if (tf.equals("y")){
            System.out.println("11");
        }
    }
}
