/*
 * @Author: your name
 * @Date: 2020-06-08 10:21:34
 * @LastEditTime: 2020-06-20 17:16:32
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\CollectionTest.java
 */ 
package com.example.demo.controller.CollectionFramework;

import java.util.*;
import com.example.demo.controller.Hero.HeroDemo1;

public class CollectionTest {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        //testAdd();
        //testContain();
        //testFor();
        //testHashmap();
        //revHashMap();
        testLinkHashSet();
    }

    public static void testAdd() {
        //容器类ArrayList,用于存放对象
        ArrayList heros = new ArrayList();
        heros.add(new HeroDemo1("盖伦", 450));
        System.out.println(heros.size());

        //容器的容量capacity会随着对象的增加自动增长
        //只需要不断往容器里增加英雄即可，无需担心会出现数组的边界问题
        heros.add(new HeroDemo1("提莫", 365));
        System.out.println(heros.size());
    }

    public static void testContain() {
        ArrayList heros = new ArrayList();

        for(int i=0; i<5; i++)
        {
            heros.add(new HeroDemo1("hero"+i, 100+i));
        }
        HeroDemo1 specialHero = new HeroDemo1("special hero", 200);
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println(heros.contains(specialHero));
        System.out.println(heros.get(5));
        System.out.println(heros.indexOf(specialHero));
    }

    public static void testFor() {
        List<HeroDemo1> heros = new ArrayList<HeroDemo1>();
        for(int i=0; i<5; i++){
            heros.add(new HeroDemo1("hero name"+i, i));
        }
        //第一种遍历for循环
        System.out.println("---------for循环Demo------------");
        for(int i=0; i<heros.size(); i++){
            HeroDemo1 h = heros.get(i);
            System.out.println(h);
        }

        //第二种遍历使用迭代器
        System.out.println("----------迭代器while写法--------------");
        Iterator<HeroDemo1> it = heros.iterator();
        while (it.hasNext()) {
            HeroDemo1 h = it.next();
            System.out.println(h);
        }

        System.out.println("----------迭代器for循环写法--------------");
        for (Iterator<HeroDemo1> iterator = heros.iterator(); iterator.hasNext();) {
            HeroDemo1 hero = (HeroDemo1) iterator.next();
            System.out.println(hero);
        }

        //第三种增强型for循环
        System.out.println("----------增强型for循环----------");
        for(HeroDemo1 h : heros){
            System.out.println(h);
        }
    }

    public static void testRemove() {
    // 首先初始化一个HeroDemo1集合，里面放100个Hero对象，名称分别从hero0....hero99
    // 通过遍历手段，删除掉编号是8的倍数的对象
        List<HeroDemo1> heros = new ArrayList<HeroDemo1>();
        List<Integer> a = new ArrayList<>();

        for(int i=0; i<100; i++){
            heros.add(new HeroDemo1("hero name"+i, i));
        }
        for (int i = 0; i < 100; i++) {
            HeroDemo1 h = heros.get(i);
            if (i%8==0) {
                a.add(i);
            }
        }
        for (int i = a.size()-1; i >=0; i--) {
            int j=a.get(i);
            heros.remove(j);
        }
        System.out.println(heros.toString());
    }

    public static void testHashmap() {
        HashMap<String,HeroDemo1> heroMap = new HashMap<String, HeroDemo1>();
    
        String heroname = "gareen";
        
        heroMap.put(heroname, new HeroDemo1("gareen1", 612));
        System.out.println(heroMap);

        heroMap.put(heroname, new HeroDemo1("newgareen2", 6120));
        System.out.println(heroMap);

        heroMap.clear();
        HeroDemo1 gareen = new HeroDemo1(heroname, 123);
        
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);
        System.out.println(heroMap);
    }

    public static void revHashMap() {
        HashMap<String,String> hmp=new HashMap<>();
        HashMap<String,String> mmp=new HashMap<>();
        hmp.put("adc","物理英雄");
        hmp.put("apc","魔法英雄");
        hmp.put("t","坦克");
        Set<String> keys=hmp.keySet();
        System.out.println(hmp);
        for (String key:keys){
            mmp.put(hmp.get(key),key);
        }
        System.out.println(mmp);
    }

    public static void testLinkHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        double pi = Math.PI;
        while (set.size()<7) {
            set.add((Integer)(int)pi%10);
            pi*=10;
        }
        System.out.println(set);
    }

}