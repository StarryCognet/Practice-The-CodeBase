package com.lening.computer;

public class Computer {
    private String Name;
    private String Brand;
    private int Price;

    public Computer(String name, String brand, int price) {
        Name = name;
        Brand = brand;
        Price = price;
    }

    public Computer() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Name='" + Name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Price=" + Price +
                '}';
    }
}
