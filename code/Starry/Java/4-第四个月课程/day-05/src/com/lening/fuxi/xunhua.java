package com.lening.fuxi;

public class xunhua {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 0; j < 5 - i - 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//
//        for (int i = 1; i <= 5; i++) {
//            //先打#号
//            for (int k = 0; k <= 5 - i; k++) {
//                System.out.print(" ");
//            }
//            //再打*号
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();           //换行
//        }
//
//        for (int i = 4; i >= 1; i--) {
//            //先打#号
//            for (int k = 0; k <= 5 - i; k++) {
//                System.out.print(" ");
//            }
//            //再打*号
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();           //换行
//        }

    }
}
