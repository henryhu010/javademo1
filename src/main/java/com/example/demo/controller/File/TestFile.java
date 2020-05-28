/*
 * @Author: your name
 * @Date: 2020-05-28 14:51:09
 * @LastEditTime: 2020-05-28 15:24:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\File\TestFile.java
 */ 
package com.example.demo.controller.File;

import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        //绝对路径
        File f1 = new File("D:/code/Test/demo/LOLFolder");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());

        //相对路径
        File f2 = new File("LOL.txt");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        //把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.txt");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

        File f = new File("D:/code/Test/demo/LOLFolder/LOL.txt");
        System.out.println("当前文件是：" + f);
        //判断文件是否存在
        System.out.println("判断文件是否存在:" + f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹：" + f.isDirectory());

        //是否是文件(非文件夹)
        System.out.println("判断是否是文件：" + f.isFile());

        //文件长度
        System.out.println("获取文件长度：" + f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件最后修改时间：" + d);
        //设置文件时间格式为 年月日 时分秒
        f.setLastModified(0);

        //文件重命名
        File f4 = new File("D:/code/Test/demo/LOLFolder/Dota.txt");
        f.renameTo(f4);
        System.out.println("把LOL.txt改名为Dota.txt了。 f:" + f.getName() + " / f4:" + f4.getName());
    }
}