package com.lianxi.test1;

import java.io.InputStream;

public class Book {
    private Integer id;
    private String name;
    private String zuozhe;
    private Double jiage;

    static Integer na = 1;

    public Book() {
    }

    public Book(Integer id, String name, String zuozhe, Double jiage) {
        this.id = id;
        this.name = name;
        this.zuozhe = zuozhe;
        this.jiage = jiage;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public Double getJiage() {
        return jiage;
    }

    public void setJiage(Double jiage) {
        this.jiage = jiage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                ", jiage=" + jiage +
                '}';
    }
}
