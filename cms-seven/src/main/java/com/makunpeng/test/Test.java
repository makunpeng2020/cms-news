package com.makunpeng.test;

import java.util.ArrayList;
import java.util.List;

import com.makunpeng.bean.BankCard;
import com.makunpeng.bean.Person;

public class Test {

	public static void main(String[] args) {

		BankCard bc11 = new BankCard("6223800008", "��������");
		BankCard bc12 = new BankCard("6224800008", "ũҵ����");
		BankCard bc13 = new BankCard("6258974163", "��������");
		BankCard bc14 = new BankCard("6296834715", "��������");//�������п��Ķ���
		List<BankCard> list8=new ArrayList<BankCard>();
		list8.add(bc11);
		list8.add(bc12);
		list8.add(bc13);
		list8.add(bc14);
		Person p8=new Person(5, "����" ,"4102548887469854X", list8);
		
		
		
		BankCard bc = new BankCard("6223800001", "��������");
		BankCard bc1 = new BankCard("6224800001", "ũҵ����");//�������п��Ķ���
		List<BankCard> list=new ArrayList<BankCard>();
		list.add(bc);
		list.add(bc1);
		Person p1=new Person(1, "������" ,"41142219801002531X", list);
		
		BankCard bc2 = new BankCard("6223800002", "��������");//�������п��Ķ���
		BankCard bc3 = new BankCard("6224800002", "ũҵ����");
		BankCard bc4 = new BankCard("6225800001", " ��������");
		List<BankCard> list1=new ArrayList<BankCard>();
		list1.add(bc2);
		list1.add(bc3);
		list1.add(bc4);		
		Person p2=new Person(2, "��˼��","41141219801002532X", list1);
		
		
		BankCard bc5 = new BankCard("6223800003", "��������");
		BankCard bc6 = new BankCard("6224800003", "ũҵ����");//�������п��Ķ���
		BankCard bc7 = new BankCard("6225800002", " ��������");
		List<BankCard> list3=new ArrayList<BankCard>();
		list3.add(bc5);
		list3.add(bc6);
		list3.add(bc7);			
		Person p3=new Person(3, "������","411412198010025324", list3);
		
		
		BankCard bc8 = new BankCard("6223800004", "��������");
		BankCard bc9 = new BankCard("6224800005", "ũҵ����");		//�������п��Ķ���
		BankCard bc10 = new BankCard("6221800002", " ��������");
		List<BankCard> list4=new ArrayList<BankCard>();
		list4.add(bc8);
		list4.add(bc9);
		list4.add(bc10);	
		
		Person p4=new Person(4, "��С��","411412198010025311", list4);
		List<Person> listPersons=new ArrayList<Person>();
		listPersons.add(p1);
		listPersons.add(p2);
		listPersons.add(p3);//�ɸ���person�������  listPersons������
		listPersons.add(p4);
		listPersons.add(p8);
		for (Person person : listPersons) {
			//2��������û����ֵ� list ���ϣ�����ӡ����Ϣ��10�֣�.
			System.out.println("�û�������"+person.getName());
			List<BankCard> bankCards = person.getBankCards();
			for (BankCard bankCard : bankCards) {
				System.out.print(bankCard);
			}
			System.out.println();
		}
		
		System.out.println("2.3��ȡ�û���������������û���Ϣ������ӡ����Ϣ��10�֣�.");
		for (Person person : listPersons) {
			//���ҵ�person����
			//����ҵ�����Ϊ�������ᡱ ����
			if (person.getName().equals("������")) {
				System.out.println(person);
				//���� person ��getBankCards������������Ҫ�����п�����
				  List<BankCard> ban = person.getBankCards();
				  for (BankCard p : ban) {
					  System.out.println(p); 
				  
				  } System.out.println();
				 
			}
			
		}
		System.out.println("4�������Ϊ �������� �ͻ��� ���п� cards ���ϣ�����Ӧ����Ϣ��10�֣�.");
		for (Person person : listPersons) {
			//���ҵ�person����
			//����ҵ�����Ϊ�������� ����
			if (person.getName().equals("����")) {
				
				//���� person ��getBankCards������������Ҫ�����п�����
				  List<BankCard> ban = person.getBankCards();
				  for (BankCard p : ban) {
					  	System.out.println(p); 
				  
				  } System.out.println();
				 
			}
			
		}
	}

}
