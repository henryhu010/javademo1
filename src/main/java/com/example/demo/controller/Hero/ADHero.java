/*
 * @Author: your name
 * @Date: 2020-04-22 15:50:57
 * @LastEditTime: 2020-04-22 16:05:18
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\ADHero.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Charactor.AD;

public class ADHero extends HeroDemo1 implements AD {

    public ADHero(String name, float hp) {
        super(name, hp);
    }

    @Override
    public void physicAttack() {
        System.out.println("进行单物理攻击");
    }

}