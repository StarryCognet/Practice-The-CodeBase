package com.lening.test1;

public class MyExecption {

    /**
     * 睡觉异常
     */
    public static void sleepException(){
       try{
           int res = 1 / 0;
       }catch (Exception e){
           throw e;         //抛出异常
       }
    }
}
