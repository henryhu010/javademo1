/*
 * @Author: your name
 * @Date: 2020-06-10 14:35:46
 * @LastEditTime: 2020-06-10 18:56:00
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\HeroNode.java
 */ 

package com.example.demo.controller.CollectionFramework;

import java.util.*;
import com.example.demo.controller.Hero.HeroDemo1;

public class HeroNode extends HeroDemo1 {
    public HeroNode leftHeroNode;
    public HeroNode rightHeroNode;
    public HeroDemo1 value;

    public List<HeroDemo1> values(){
        List<HeroDemo1> values = new ArrayList<>();
        if (leftHeroNode != null) {
            values.addAll(leftHeroNode.values());
        }
        values.add(value);
        if (rightHeroNode != null) {
            values.addAll(rightHeroNode.values());
        }
        return values;
    }

    //二叉树插入规则：大的放左边，小的或者相同的放右边
    public void add(HeroDemo1 hr2) {
        if (value == null) {
            value = hr2;
        } else {
            if (hr2.hp > value.hp) {
                if (leftHeroNode == null) {
                    leftHeroNode = new HeroNode();
                    leftHeroNode.add(hr2);
                }
            } else {
                if (rightHeroNode == null) {
                    rightHeroNode = new HeroNode();
                    rightHeroNode.add(hr2);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<HeroDemo1> hero2list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int radomhp = (int)(Math.random()*100+1);
            HeroDemo1 hr2 = new HeroDemo1();
            hr2.name = "new hero" + i;
            hr2.hp = radomhp;
            hero2list.add(hr2);
        }
        for (HeroDemo1 hr2 : hero2list) {
            System.out.println("打印生成对象："+ hr2.name + "hp:" + hr2.hp);
        }
        //将生成好的英雄对象利用for循环挨个装进实例化对象的生成对象
        HeroNode hntree = new HeroNode();
        for (HeroDemo1 hr2 : hero2list) {
            hntree.add(hr2);
        }
        List<HeroDemo1> hr2streehero = hntree.values();
        for (HeroDemo1 hr2 : hr2streehero) {
            System.out.println("打印生成的二叉树对象（基于hp排序）：" + hr2.name + "///" + hr2.hp);
        }
    }

}
