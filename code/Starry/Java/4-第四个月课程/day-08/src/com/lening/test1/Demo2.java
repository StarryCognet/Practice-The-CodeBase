package com.lening.test1;

public class Demo2 {

    public void test1(){
        try{
            MyExecption.sleepException();
        }catch (Exception e){
            System.out.println("0不能做除数!");
        }
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.test1();
    }
}
