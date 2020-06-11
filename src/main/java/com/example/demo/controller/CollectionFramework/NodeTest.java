/*
 * @Author: your name
 * @Date: 2020-06-10 10:11:08
 * @LastEditTime: 2020-06-10 14:44:12
 * @LastEditors: Please set LastEditors
 * @Description: 通过二叉树对如下10个随机数进行排序，第一步把数据插入二叉树，插入基本逻辑是，小或相同的放左边，大的放右边。
 * @FilePath: \demo\src\main\java\com\example\demo\controller\CollectionFramework\NodeTest.java
 */

package com.example.demo.controller.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {
    public NodeTest leftNode;
    public NodeTest rightNode;

    public Object value;

    //二叉树插入数据
    public void add(Object v){
        //如果当前节点没有值，就把数据放在当前节点上
        if (value == null) {
            value = v;
        } 
        //如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            //新增值比当前值小或相同
            if ((Integer)v - (Integer)value <= 0) {
                if (leftNode == null) {
                    leftNode = new NodeTest();
                }
                    leftNode.add(v);
            } 
            //新增值比当前值大    
            else {
                if (rightNode == null) {
                    rightNode = new NodeTest();
                }
                rightNode.add(v);
            }
        }
    }

/*二叉树遍历分为左序、中序和右序三种。
*左序，中间的数遍历后放在左边；
*中序，中间的数遍历后放在中间；
*右序，中间的数遍历后放在右边；
*/
    public List<Object> values(){
        List<Object> values = new ArrayList<>();
        if (leftNode != null) {
            values.addAll(leftNode.values());
        }

        values.add(values);
        
        if (rightNode != null) {
            values.addAll(rightNode.values());
        }

        return values;
    }

    public static void main(String[] args) {
        int randomes[] = new int[] {67, 7, 30, 73, 10, 0, 78, 81, 10, 74};

        NodeTest roots = new NodeTest();
        for (int number : randomes) {
            roots.add(number);
        }

        System.out.println(roots.values());
    }
}