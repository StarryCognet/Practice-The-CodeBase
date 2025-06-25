package com.lening.test6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合的特点: 唯一  无序
 */
public class TestHashSet {

    public static void main(String[] args) {
        //创建set集合
        Set<String> nameSet = new HashSet<String>();

        //添加数据
        nameSet.add("张三");
        nameSet.add("李四");
        nameSet.add("李四");
        nameSet.add("王五");

        //循环遍历set集合
        for (String name : nameSet) {
            System.out.println(name);
        }

        //获取集合的迭代器
        Iterator<String> it = nameSet.iterator();

        while (it.hasNext()){   //it.hasNext();  判断迭代器中是否存在下一个需要被迭代的元素
            String name = it.next();      //迭代下一个元素
            if(name.equals("张三")){
                it.remove();            //从迭代器中删除这一代信息
            }
            System.out.println(name);
        }

        System.out.println("===========删除之后循环遍历===========");
        for (String name : nameSet) {
            System.out.println(name);
        }


        System.out.println(nameSet.size());
    }
}
