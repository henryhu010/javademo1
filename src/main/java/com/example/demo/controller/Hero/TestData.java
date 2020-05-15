/*
 * @Author: your name
 * @Date: 2020-05-15 14:25:34
 * @LastEditTime: 2020-05-15 14:35:56
 * @LastEditors: Please set LastEditors
 * @Description: 日期格式化测试
 * @FilePath: \demo\src\main\java\com\example\demo\controller\Hero\TestData.java
*/ 

package com.example.demo.controller.Hero;

import java.text.SimpleDateFormat;
import java.util.Date;


 public class TestData {
     public static void main(String[] args) {
         String[] ch = new String[9];
         SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         System.out.println("得到的随机日期数组：");
         for (int i = 0; i < ch.length; i++) {
            long l = (long) (Math.random()*30*365*24*60*60*1000);
            Date d1 = new Date(l);
            ch[i] = s.format(d1);
            System.out.print(ch[i]+"  ");
            if((i+1)%3==0)
                System.out.println();
         }
         for (int i = 0; i < ch.length; i++) {
            for (int j = i; j < ch.length; j++) {
                try {
                    Date d2 = s.parse(ch[i]);
                    long i1 = d2.getTime();
                     
                    Date d3 = s.parse(ch[j]);
                    long i2 = d3.getTime();
                     
                    if(i1 < i2){
                        String str = ch[i];
                        ch[i] = ch[j];
                        ch[j] = str;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
         System.out.println("排序后的随机日期数组：");
         for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]+"  ");
                if((i+1)%3==0)
                    System.out.println();
             }
     }
 }


