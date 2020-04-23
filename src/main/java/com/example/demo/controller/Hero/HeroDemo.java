package com.example.demo.controller.Hero;

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

    public void main(final String[] args) {
        final HeroDemo teemo = new HeroDemo("提莫", 383);
        final HeroDemo garen = new HeroDemo("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
    }
 
}