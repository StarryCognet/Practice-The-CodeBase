package com.lening.test1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * try: 可能会出现异常的代码
 * catch: 捕捉try中所出现的异常    可以写多个
 * finally: 最终的   无论是否出现异常都会走的模块        适合释放资源
 *
 * throw:手动抛出异常
 * throws:声明异常    向上抛出异常
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("请输入被除数:");
            int num1 = input.nextInt();
            System.out.println("请输入除数:");
            int num2 = input.nextInt();

            int res = num1 / num2;
            System.out.println("商:" + res);
        }catch (ArithmeticException e){
            //e.printStackTrace();        //输出异常的堆栈信息
            //System.out.println(e.getMessage());
            System.out.println("除数不能为0!");
        }catch (InputMismatchException e){
            System.out.println("请输入数字!");
        }catch (Exception ex){
            System.out.println("系统维护中，请稍后!");
        }finally{
            System.out.println("无论是否出现异常都会执行!");
        }
        System.out.println("其他代码。。。。");
    }
}
