package com.ict05.collection;

import java.util.ArrayList;

public class Ex10_Team_join {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		
		list1.add("��ο�");
		list1.add("Ȳ����");
		list1.add("�輼��");
		list1.add("�����");
		list1.add("���");
		list1.add("������");
		
		list1.add("������");
		list1.add("�����");
		list1.add("������");
		list1.add("���ù�");
		list1.add("�ڹμ�");
		
		list1.add("������");
		list1.add("������");
		list1.add("������");
		list1.add("��ȣ��");
		list1.add("������");
			

		list2.add("�赿��");
		list2.add("��ȣ��");
		list2.add("����ȯ");
		list2.add("������");
		list2.add("�����");
		list2.add("�赿��");
		list2.add("���α�");
		list2.add("����ȯ");
		

		for (int i = 0; i < 4; i++) {
			String team = "";
			for (int j = 0; j < 4; j++) {
				int k = (int)(Math.random()*list1.size());
				String name = list1.get(k);
				team += name+", " ;
				list1.remove(name);
			}
			System.out.println(i+1+"�� : "+ team);
		}

		System.out.println("==================");

		for (int i = 0; i < 4; i++) {
			String team = "";
			for (int j = 0; j < 2; j++) {
				int k = (int)(Math.random()*list2.size());
				String name = list2.get(k);
				team += name+", " ;
				list2.remove(name);
			}
			System.out.println(i+1+"�� : "+team);
		}
	}
}
