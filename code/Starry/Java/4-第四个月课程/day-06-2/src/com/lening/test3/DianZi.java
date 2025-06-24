package com.lening.test3;

/**
 * 电子产品类    父类
 */
public abstract class DianZi {

    private String name;
    private String type;
    private Integer price;

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

    public DianZi() {
    }

    public DianZi(String name, String type, Integer price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    /**
     * 打印
     */
    public abstract void print();
}
