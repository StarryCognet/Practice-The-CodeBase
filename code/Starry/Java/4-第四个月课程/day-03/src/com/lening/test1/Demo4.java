package com.lening.test1;

public class Demo4 {
    public static void main(String[] args) {
        //某酒吧搞店庆活动，两个酒瓶可以换一瓶啤酒，四个瓶盖也可以换一瓶啤酒，请问：
        //小明买了十瓶啤酒，最后能喝多少瓶啤酒。
        int beer = 10;           //啤酒
        int bottle = 10;         //酒瓶
        int gai = 10;           //瓶盖

        while (true) {
            //先换酒瓶     2个酒瓶换一个啤酒   得到一个酒瓶  一个瓶盖
            if(bottle >= 2){
                bottle -= 2;    //酒瓶-2
                beer += 1;      //得到一个啤酒
                bottle += 1;    //得到一个酒瓶
                gai += 1;       //得到一个瓶盖
            }


            //再换瓶盖    4个瓶盖换一个啤酒   得到一个酒瓶  一个瓶盖
            if(gai >= 4){
                gai -= 4;    //酒瓶-4
                beer += 1;      //得到一个啤酒
                bottle += 1;    //得到一个酒瓶
                gai += 1;       //得到一个瓶盖
            }

            if(bottle < 2 && gai < 4){
                break;          //终止循环
            }
        }

        System.out.println("一共喝了"+beer+"瓶啤酒");
    }
}
