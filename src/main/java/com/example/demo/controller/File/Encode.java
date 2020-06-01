/*
 * @Author: your name
 * @Date: 2020-06-01 08:50:59
 * @LastEditTime: 2020-06-01 10:40:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \demo\src\main\java\com\example\demo\controller\File\EnDecode.java
 */ 
package com.example.demo.controller.File;

import java.io.*;

public class Encode {
    static File f1 = new File("D:/code/Test/demo/LOLFolder/Endecode1.txt");
    static File f2 = new File("D:/code/Test/demo/LOLFolder/Endecode2.txt");

    public static void main(String[] args) {
        encodeFile(f1, f2);
    }

    public static void encodeFile(File encodingFile, File encodeFile) {
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
            
            System.out.println("加密前的内容:");
            for(char c : before){
                System.out.println(c);
            }
            System.out.println("加密后的内容:");
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
        if ((int)c>=48 && (int)c<=56) {
            return (char)(c+1);
        } else if((int)c == 57) {
            return '0';
        } else if ((int)c>=65 && (int)c<=89) {
            return (char)(c+1);
        } else if ((int)c == 90) {
            return 'A';
        } else if ((int)c>=97 && (int)c<=121) {
            return (char)(c+1);
        } else if ((int)c == 122) {
            return 'a';
        } else{
            return c;
        }
    }

}