/*
 * @Author: Henry
 * @Date: 2020-04-22 16:02:33
 * @LastEditTime: 2020-04-22 16:05:02
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\ADAPHero.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Charactor.AD;
import com.example.demo.controller.Charactor.AP;

/**
 * @description:同时进行物理和魔法伤害 
 * @param {type} 
 * @return: 
 */
public class ADAPHero extends HeroDemo implements AD, AP {

    public ADAPHero(String name, float hp) {
        super(name, hp);
    }

    @Override
    public void magicAttack() {
        System.out.println("进行1.魔法攻击！！！");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行2.物理攻击！！！");
    }

}