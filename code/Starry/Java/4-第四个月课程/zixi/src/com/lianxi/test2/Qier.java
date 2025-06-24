package com.lianxi.test2;

public class Qier extends Pet {
    private Integer age;

    public Qier() {
    }

    public Qier(String name, Integer hp, Integer love, Integer age) {
        super(name, hp, love);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Qier{" +
                "age=" + age +
                "} " + super.toString();
    }
}
