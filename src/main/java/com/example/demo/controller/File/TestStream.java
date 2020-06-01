/*
 * @Author: your name
 * @Date: 2020-05-29 09:10:53
 * @LastEditTime: 2020-05-29 10:31:51
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\File\TestStream.java
 */ 
package com.example.demo.controller.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args) {
        try {
            //文件输入流
            File f = new File("D:/code/Test/demo/LOLFolder/LOL.txt");
            FileInputStream fis = new FileInputStream(f);
            //创建字节数组，长度就是文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for(byte b : all) {
                System.out.println(b);
            }
            fis.close();

            //文件输出流
            File f1 = new File("D:/code/Test/demo/LOLFolder/LOL.txt");
            FileOutputStream fos = new FileOutputStream(f1);
            byte data[] = {88, 89};
            fos.write(data);
            fos.close();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}