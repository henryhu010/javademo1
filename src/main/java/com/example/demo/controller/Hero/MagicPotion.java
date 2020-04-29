/*
 * @Author: your name
 * @Date: 2020-04-29 16:17:28
 * @LastEditTime: 2020-04-29 16:18:03
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\MagicPotion.java
 */
package com.example.demo.controller.Hero;

import com.example.demo.controller.Item.Item;

public class MagicPotion extends Item {
    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
