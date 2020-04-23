package com.example.demo.controller.Item;

public class Item {
    String name;
	int price;
}

class Weapon extends Item{
    int damage; //攻击力
     
    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65; //damage属性在类Weapon中新设计的
         
        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;        
    }    
}

class Armor extends Item{
		int ac;//护甲防御值
		
		public static void main(String[] args) {
			Armor bujia = new Armor();
			Armor suozijia = new Armor();
			bujia.name = "布甲";
			bujia.price = 300;
			bujia.ac = 15;
			suozijia.name = "锁子甲";
			suozijia.price = 500;
			suozijia.ac = 40;
			
			System.out.println("物品 名称：" +bujia.name + "\n"+"物品价格:"+bujia.price+"\n"+"护甲等级:"+bujia.ac);
			System.out.println("物品 名称：" +suozijia.name + "\n"+"物品价格:"+suozijia.price+"\n"+"护甲等级:"+suozijia.ac);
		}
}