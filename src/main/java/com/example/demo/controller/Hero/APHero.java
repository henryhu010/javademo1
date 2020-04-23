/*
 * @Author: Henry
 * @Date: 2020-04-22 15:57:20
 * @LastEditTime: 2020-04-22 16:05:09
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\APHero.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Charactor.AP;

public class APHero extends HeroDemo implements AP {

    public APHero(String name, float hp) {
        super(name, hp);
    }

    @Override
    public void magicAttack() {
        System.out.println("进行单魔法攻击");
    }

}