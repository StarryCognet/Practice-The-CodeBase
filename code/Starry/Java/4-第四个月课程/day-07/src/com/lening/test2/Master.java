package com.lening.test2;

/**
 * 主人类
 */
public class Master {

    /**
     * 以父类类型作为形参，传入不同的子类对象
     * @param pet
     */
    public void feed(Pet pet){
        pet.eat();
    }


    /**
     * 以父类类型作为返回值类型，返回不同的子类对象
     * @param type
     * @return
     */
    public Pet getPet(String type){
        Pet pet = null;
        if(type.equals("狗")){
            pet = new Dog("贝贝",100,100,"拉布拉多犬");
        }else if(type.equals("企鹅")){
            pet = new Penguin("欢欢",100,100,"雌性");
        }
        return pet;
    }

}
