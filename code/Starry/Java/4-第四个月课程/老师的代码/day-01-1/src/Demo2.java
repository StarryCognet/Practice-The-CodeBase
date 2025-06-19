public class Demo2 {

    public static void main(String[] args) {

        //数据类型转换：1、自动类型转换   2、强制类型转换
        //1.自动类型转换    小类型转大类型
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        //2.强制类型转换    大类型转小类型
        double c = 10.9;
        int d = (int)c;
        System.out.println(c);
        System.out.println(d);
    }
}
