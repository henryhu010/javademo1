/*
 * @Author: your name
 * @Date: 2020-04-29 16:12:46
 * @LastEditTime: 2020-04-29 16:14:05
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\LifePotion.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Item.Item;

public class LifePotion extends Item {
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}
