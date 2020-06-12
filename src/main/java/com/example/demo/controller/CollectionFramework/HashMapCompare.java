/*
 * @Author: your name
 * @Date: 2020-06-12 15:56:05
 * @LastEditTime: 2020-06-12 16:33:18
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\HashMapCompare.java
 */
package com.example.demo.controller.CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapCompare {
    public static void main(final String[] args) {
        final ArrayList<Integer> content = new ArrayList<>();
        final HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 3000000; i++) {
            content.add((int)Math.random()*9999);
        }
    
        long start1 = System.currentTimeMillis();
        int a=0;
        
        for(int i=0; i<content.size(); i++){
            if (content.get(i)==(5555)) 
                a++;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("查找个数为："+a+"\t"+"arraylist所用时间为: \t"+(end1-start1)+"ms");
        
        //for遍历hashmap
        for (int i = 0; i < content.size(); i++) {
            hashMap.put(i, content.get(i));
        }
        
        long start = System.currentTimeMillis();
        int key = 0;
        for (int i = 0; i < content.size(); i++) {
            if (hashMap.get(i)==5555) {
                key++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("查找个数为："+key+"\t"+"for遍历hashmap所用时间为: \t"+(end-start)+"ms");

        //iterator遍历hashmap
        int t =0;
        long start2 = System.currentTimeMillis();
        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            int i =(int) iterator.next();
            if (i==5555) {
                t++;
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("查找个数为："+key+"\t"+"迭代器遍历hashmap所用时间为: \t"+(end2-start2)+"ms");
    }    
}

