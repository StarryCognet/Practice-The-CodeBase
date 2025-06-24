public class Demo1 {
    public static void main(String[] args) {
        //变量：在内存开辟的一块空间，用来存储数据
        //var 变量名 = 变量值;
        //数据类型 变量名 = 变量值;
        String name = "张三";
        System.out.println("姓名:"+name);

        byte num1 = 100;
        System.out.println(num1);

        int num2 = 100000000;    //-2^31 - 2 ^ 31 -1

        String tel = "123123123123";

        long num3 = 100000000000L;

        double num4 = 20.1;

        float num5 = 10.5f;

        boolean f = true;

        //字符类型   a   b   c    abc    中国
        String str = "中国";

        char c = 'a';


        //先声明，后赋值，然后使用
        //声明的同时并赋值，然后使用
        String address;
        address = "北京市昌平区沙河镇";
        System.out.println("地址:"+address);

        String sex = "男";

        tel = "123";
    }


}
