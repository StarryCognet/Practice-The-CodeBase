package com.lening.w.test2;

public class Dog {
    private String name;
    private int jk;
    private int hgd;

    public Dog() {

    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", jk=" + jk +
                ", hgd=" + hgd +
                '}';
    }
//    public Dog(){
//        this.name = "豆豆";
//        this.jk = 100;
//        this.hgd = 100;
//    }

    public Dog(String name, int jk, int hgd) {
        this.name = name;
        this.jk = jk;
        this.hgd = hgd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJk() {
        return jk;
    }

    public void setJk(int jk) {
        this.jk = jk;
    }

    public int getHgd() {
        return hgd;
    }

    public void setHgd(int hgd) {
        this.hgd = hgd;
    }
}
