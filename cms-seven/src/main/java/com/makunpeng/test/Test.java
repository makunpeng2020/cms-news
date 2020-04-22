package com.makunpeng.test;

import java.util.ArrayList;
import java.util.List;

import com.makunpeng.bean.BankCard;
import com.makunpeng.bean.Person;

public class Test {

	public static void main(String[] args) {

		BankCard bc11 = new BankCard("6223800008", "招商银行");
		BankCard bc12 = new BankCard("6224800008", "农业银行");
		BankCard bc13 = new BankCard("6258974163", "工商银行");
		BankCard bc14 = new BankCard("6296834715", "社区银行");//创建银行卡的对象
		List<BankCard> list8=new ArrayList<BankCard>();
		list8.add(bc11);
		list8.add(bc12);
		list8.add(bc13);
		list8.add(bc14);
		Person p8=new Person(5, "张三" ,"4102548887469854X", list8);
		
		
		
		BankCard bc = new BankCard("6223800001", "招商银行");
		BankCard bc1 = new BankCard("6224800001", "农业银行");//创建银行卡的对象
		List<BankCard> list=new ArrayList<BankCard>();
		list.add(bc);
		list.add(bc1);
		Person p1=new Person(1, "张三丰" ,"41142219801002531X", list);
		
		BankCard bc2 = new BankCard("6223800002", "招商银行");//创建银行卡的对象
		BankCard bc3 = new BankCard("6224800002", "农业银行");
		BankCard bc4 = new BankCard("6225800001", " 民生银行");
		List<BankCard> list1=new ArrayList<BankCard>();
		list1.add(bc2);
		list1.add(bc3);
		list1.add(bc4);		
		Person p2=new Person(2, "李思宝","41141219801002532X", list1);
		
		
		BankCard bc5 = new BankCard("6223800003", "招商银行");
		BankCard bc6 = new BankCard("6224800003", "农业银行");//创建银行卡的对象
		BankCard bc7 = new BankCard("6225800002", " 民生银行");
		List<BankCard> list3=new ArrayList<BankCard>();
		list3.add(bc5);
		list3.add(bc6);
		list3.add(bc7);			
		Person p3=new Person(3, "张三丰","411412198010025324", list3);
		
		
		BankCard bc8 = new BankCard("6223800004", "招商银行");
		BankCard bc9 = new BankCard("6224800005", "农业银行");		//创建银行卡的对象
		BankCard bc10 = new BankCard("6221800002", " 工商银行");
		List<BankCard> list4=new ArrayList<BankCard>();
		list4.add(bc8);
		list4.add(bc9);
		list4.add(bc10);	
		
		Person p4=new Person(4, "孙小宝","411412198010025311", list4);
		List<Person> listPersons=new ArrayList<Person>();
		listPersons.add(p1);
		listPersons.add(p2);
		listPersons.add(p3);//吧个个person对象放入  listPersons集合中
		listPersons.add(p4);
		listPersons.add(p8);
		for (Person person : listPersons) {
			//2获得所有用户名字的 list 集合，并打印出信息（10分）.
			System.out.println("用户姓名："+person.getName());
			List<BankCard> bankCards = person.getBankCards();
			for (BankCard bankCard : bankCards) {
				System.out.print(bankCard);
			}
			System.out.println();
		}
		
		System.out.println("2.3获取用户名字是张三丰的用户信息，并打印出信息（10分）.");
		for (Person person : listPersons) {
			//先找到person集合
			//其次找到名字为“张三丰” 的人
			if (person.getName().equals("张三丰")) {
				System.out.println(person);
				//调用 person 的getBankCards方法返回所需要的银行卡集合
				  List<BankCard> ban = person.getBankCards();
				  for (BankCard p : ban) {
					  System.out.println(p); 
				  
				  } System.out.println();
				 
			}
			
		}
		System.out.println("4获得名字为 “张三” 客户的 银行卡 cards 集合，并答应出信息（10分）.");
		for (Person person : listPersons) {
			//先找到person集合
			//其次找到名字为“张三” 的人
			if (person.getName().equals("张三")) {
				
				//调用 person 的getBankCards方法返回所需要的银行卡集合
				  List<BankCard> ban = person.getBankCards();
				  for (BankCard p : ban) {
					  	System.out.println(p); 
				  
				  } System.out.println();
				 
			}
			
		}
	}

}
