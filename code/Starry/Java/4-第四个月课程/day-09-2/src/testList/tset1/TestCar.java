package testList.tset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(1, "大众", "RR11", 340000);
        Car car2 = new Car(2, "比亚迪", "AA11", 190000);
        Car car3 = new Car(3, "小米SU7", "DD11", 20000);
        Car car4 = new Car(4, "仰望", "TT11", 90000);
        Car car5 = new Car(5, "奥迪", "CC11", 500000);

        List<Car> carList = new ArrayList<>();
        Collections.addAll(carList, car1, car2, car3, car4, car5);

        System.out.println("遍历数组");
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("把集合中的所有汽车信息按照汽车价格降序排列，并且遍历排序之后的集合数据");
        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getCprice() - o2.getCprice());
            }
        });
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("输出集合中汽车的平均价格");
        double numPrice = 0;
        for (Car car : carList) {
            numPrice += car.getCprice();
        }
        double avePrice = numPrice / carList.size();
        System.out.println(avePrice);
        System.out.println("输出集合中汽车价格比平均价格高的汽车信息");
        for (Car car : carList) {
            if (car.getCprice() > avePrice){
                System.out.println(car);
            }
        }
        System.out.println("查找集合中是否存在一个品牌为”奥迪”汽车，" +
                "如果存在，则输出其价格，如果不存在，则输出该汽车不存在");
        boolean f = false;
        for (Car car : carList) {
            if (car.getCbrand().equals("奥迪")){
                f = true;
                System.out.println(car.getCprice());
            }
        }
        if (!f){
            System.out.println("该汽车不存在");
        }

        System.out.println(
        "查找集合中是否存在价格低于100000元的汽车，" +
        "如果有，则删除，删除后提示删除成功，然后遍历删除之后的集合信息；" +
        "如果没有，则提示没有价格低于100000元的汽车。"
        );
        f = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCprice() < 100000){
                f = true;
                carList.remove(i);
            }
        }
        if (f){
            for (Car car : carList) {
                System.out.println(car);
            }
            System.out.println("删除成功");
        }else {
            System.out.println("没有价格低于100000元的汽车");
        }

        System.out.println("将集合中的元素打乱原有的顺序，并遍历输出集合中的元素信息");
        Collections.shuffle(carList);
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("获取集合中价格最贵的汽车信息");
        Car max = Collections.max(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getCprice() - o2.getCprice());
            }
        });
        System.out.println(max);
    }
}
