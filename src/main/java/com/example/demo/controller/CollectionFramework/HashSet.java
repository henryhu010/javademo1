/*
 * @Author: your name
 * @Date: 2020-06-18 14:35:01
 * @LastEditTime: 2020-06-18 14:59:51
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\HashSet.java
 */ 
package com.example.demo.controller.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;

public class HashSet {
    public static void main(String[] args) {
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = createString();
        }
        numOfRepetition(strings);
    }
    
    private static String createString() {
        String sum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] c = sum.toCharArray();
        Random random = new Random();
        String result = String.valueOf(c[random.nextInt(sum.length())])+String.valueOf(c[random.nextInt(sum.length())]);
        return result;
    }

    private static void numOfRepetition(String[] strings) {
        HashSet<String> repetition = new HashSet<String>();
        HashSet<String> stringHashSet = new HashSet<String>();
        for (int i = 0; i < strings.length; i++) {
            if (!stringHashSet.contains(strings[i])) {
                stringHashSet.add(strings[i]);
            } else {
                repetition.add(strings[i]);
            }
        }
        System.out.println("总共有"+repetition.size()+"种重复的字符串");
        System.out.println("分别是：");
        Iterator<String> it = repetition.Iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s+" ; ");
        }
    }



}