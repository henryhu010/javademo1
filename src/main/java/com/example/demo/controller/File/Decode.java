/*
 * @Author: your name
 * @Date: 2020-06-01 10:36:34
 * @LastEditTime: 2020-06-01 17:09:15
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\File\Decode.java
 */ 
package com.example.demo.controller.File;

import java.io.*;

public class Decode {
    static File f1 = new File("D:/code/Test/demo/LOLFolder/Endecode2.txt");
    static File f2 = new File("D:/code/Test/demo/LOLFolder/Endecode1.txt");

    public static void main(String[] args) {
        decodeFile(f1, f2);
    }

    public static void decodeFile(File encodingFile, File encodeFile) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(encodingFile);
            fw = new FileWriter(encodeFile);
            // 存储加密前的字符数组
            char[] before = new char[(int)f1.length()];
            fr.read(before);
            //存储加密后的字符数组
            char[] after = new char[(int)f1.length()];
            for(int i=0; i <before.length; i++){
                after[i]=change(before[i]);
            }
            fw.write(after);
            
            System.out.println("解密前的内容:");
            for(char c : before){
                System.out.println(c);
            }
            System.out.println("解密后的内容:");
            for(char c : after){
                System.out.println(c);
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        finally{
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }

    public static char change(char c) {
        if ((int)c>=49 && (int)c<=57) {
            return (char)(c-1);
        } else if((int)c == 49) {
            return '9';
        } else if ((int)c>=66 && (int)c<=90) {
            return (char)(c-1);
        } else if ((int)c == 65) {
            return 'Z';
        } else if ((int)c>=98 && (int)c<=122) {
            return (char)(c-1);
        } else if ((int)c == 97) {
            return 'z';
        } else{
            return c;
        }
    }
}
