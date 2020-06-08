/*
 * @Author: your name
 * @Date: 2020-06-08 10:21:34
 * @LastEditTime: 2020-06-08 15:34:58
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\CollectionTest.java
 */ 
package com.example.demo.controller.CollectionFramework;

import java.util.*;
import com.example.demo.controller.Hero.HeroDemo;

public class CollectionTest {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        testAdd();
        testContain();

    }

    public static void testAdd() {
        //容器类ArrayList,用于存放对象
        ArrayList heros = new ArrayList();
        heros.add(new HeroDemo("盖伦", 450));
        System.out.println(heros.size());

        //容器的容量capacity会随着对象的增加自动增长
        //只需要不断往容器里增加英雄即可，无需担心会出现数组的边界问题
        heros.add(new HeroDemo("提莫", 365));
        System.out.println(heros.size());
    }

    public static void testContain() {
        ArrayList heros = new ArrayList();

        for(int i=0; i<5; i++)
        {
            heros.add(new HeroDemo("hero"+i, 100+i));
        }
        HeroDemo specialHero = new HeroDemo("special hero", 200);
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println(heros.contains(specialHero));
        System.out.println(heros.get(5));
        System.out.println(heros.indexOf(specialHero));
    }
}