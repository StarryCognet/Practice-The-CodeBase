package com.lening.test2;

public class TestPet {

    public static void main(String[] args) {
        Master m = new Master();

        Pet pet = m.getPet("狗");

        //判断对象的类型
        if(pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.show();
        }else if(pet instanceof Penguin){
            Penguin p = (Penguin) pet;
            p.show();
        }
    }
}
