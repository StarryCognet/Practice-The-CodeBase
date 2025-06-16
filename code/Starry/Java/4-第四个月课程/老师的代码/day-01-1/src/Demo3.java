import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //Scanner 扫描器
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = input.next();           //input.next(); 扫描字符串类型的数据
        System.out.println("请输入年龄:");
        int age = input.nextInt();                        //input.nextInt(); 扫描int类型的数据
        System.out.println("请输入性别:");
        String sex = input.next();
        System.out.println("请输入分数:");
        double score = input.nextDouble();               //input.nextDouble(); 扫描double类型的数据


        System.out.println("姓名:" + name + ",年龄:" + age + ",性别:" + sex + ",分数:" + score);

    }
}
