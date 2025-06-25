package com.lening.zy;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    public static void main(String[] args) {
        // 创建三个Computer对象，并给每个对象的属性赋值
        Computer computer1 = new Computer("联想", 5000, "联想公司", "中国");
        Computer computer2 = new Computer("戴尔", 6000, "戴尔公司", "美国");
        Computer computer3 = new Computer("惠普", 4500, "惠普公司", "美国");

        // 将这三个对象添加到cList集合中
        List<Computer> cList = new ArrayList<>();
        cList.add(computer1);
        cList.add(computer2);
        cList.add(computer3);

        // 遍历cList集合中所有的电脑信息
        System.out.println("所有电脑信息:");
        for (Computer computer : cList) {
            computer.show();
        }

        // 查询集合中是否存在电脑品牌名称为联想的信息
        boolean hasLenovo = false;
        for (Computer computer : cList) {
            if ("联想".equals(computer.getBrand())) {
                System.out.println("找到联想电脑信息:");
                computer.show();
                hasLenovo = true;
                break; // 找到一个就满足要求
            }
        }
        if (!hasLenovo) {
            System.out.println("未找到联想电脑信息");
        }

        // 查询cList集合中电脑价格大于平均价格的电脑信息
        int total = 0;
        for (Computer computer : cList) {
            total += computer.getPrice();
        }
        int averagePrice = total / cList.size();
        System.out.println("平均价格为: " + averagePrice);

        System.out.println("高于平均价格的电脑信息:");
        for (Computer computer : cList) {
            if (computer.getPrice() > averagePrice) {
                computer.show();
            }
        }

        // 查找并删除品牌为戴尔的电脑信息
        boolean deleted = false;
        // 使用迭代器安全删除
        for (Computer computer : new ArrayList<>(cList)) { // 创建副本避免并发修改异常
            if ("戴尔".equals(computer.getBrand())) {
                cList.remove(computer);
                deleted = true;
                System.out.println("已删除戴尔电脑信息");
                break; // 找到一个就满足要求
            }
        }
        if (!deleted) {
            System.out.println("未找到戴尔电脑信息");
        }

        // 查询cList集合中最贵的电脑信息
        Computer mostExpensive = null;
        for (Computer computer : cList) {
            if (mostExpensive == null || computer.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = computer;
            }
        }
        if (mostExpensive != null) {
            System.out.println("最贵的电脑信息:");
            mostExpensive.show();
        }
    }
}