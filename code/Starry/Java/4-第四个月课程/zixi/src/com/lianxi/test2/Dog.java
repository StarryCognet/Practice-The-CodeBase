package com.lianxi.test2;

public class Dog extends Pet {
    private String leixing;

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public Dog() {
    }

    public Dog(String name, Integer hp, Integer love, String leixing) {
        super(name, hp, love);
        this.leixing = leixing;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "leixing='" + leixing + '\'' +
                "} " + super.toString();
    }
}
