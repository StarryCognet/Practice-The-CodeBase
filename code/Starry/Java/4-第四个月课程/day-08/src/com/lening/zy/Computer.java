package com.lening.zy;

public class Computer {
    private String brand; // 电脑品牌
    private int price;    // 电脑价格
    private String company; // 出产公司
    private String area;    // 产地

    // 构造函数
    public Computer(String brand, int price, String company, String area) {
        this.brand = brand;
        this.price = price;
        this.company = company;
        this.area = area;
    }

    // Getter 和 Setter 方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // 显示电脑信息的方法
    public void show() {
        System.out.println("电脑品牌: " + brand + ", 价格: " + price + ", 出产公司: " + company + ", 产地: " + area);
    }
}