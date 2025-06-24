package com.lening.jiekolianxi;

public class HpDaYinJi implements Shape {
    @Override
    public void zhijiao() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
        }
    }

    @Override
    public void juXing() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
