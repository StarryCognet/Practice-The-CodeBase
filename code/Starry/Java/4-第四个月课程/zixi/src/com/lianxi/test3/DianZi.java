package com.lianxi.test3;

public class DianZi {
    private String name;
    private String type;
    private Integer price;

    public DianZi(String name, String type, Integer price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public DianZi() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DianZi{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

}
