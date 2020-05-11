/*
 * @Author: your name
 * @Date: 2020-04-09 15:49:42
 * @LastEditTime: 2020-04-29 16:48:07
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\HeroDemo.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Item.*;

public class HeroDemo {
    String name; // 姓名
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; // 移动速度
 
    public HeroDemo(final String name, final float hp) {
        this.name = name;
        this.hp = hp;
    }

    // 攻击一个英雄，并让他掉damage点血
    public void attack(final HeroDemo hero, final int damage) {
        hero.hp = hero.hp - damage;
    }

    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }

    public void useItem(Item i){
        i.effect();
    }

    public static void main(final String[] args) {
        final HeroDemo teemo = new HeroDemo("提莫", 383);
        final HeroDemo garen = new HeroDemo("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);

        LifePotion lp = new LifePotion();
        MagicPotion mp = new MagicPotion();
        
        garen.useItem(lp);
        garen.useItem(mp);
    }

}