package com.lening.test1;

/**
 * 人类
 */
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //展示信息
    public abstract void show();

    //考试
    public abstract void exam(String cname);
}
