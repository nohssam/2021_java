package com.ict05.collection;

import java.util.ArrayList;

public class Ex10_Team_join {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		
		list1.add("±è¹Î¿µ");
		list1.add("È²ÁØÇõ");
		list1.add("±è¼¼Áø");
		list1.add("±è°æÇö");
		list1.add("Çã»ù");
		list1.add("»çÀ¯Áø");
		
		list1.add("À±Áö¹ü");
		list1.add("ÀÌÀç¿í");
		list1.add("±èÂùÈñ");
		list1.add("³²±Ã¹Î");
		list1.add("¹Ú¹Î¼­");
		
		list1.add("Á¤¿µÁ¦");
		list1.add("ÃÖÁßÈÆ");
		list1.add("ÃÖÁö¿ì");
		list1.add("ÀåÈ£¸²");
		list1.add("ÃÖÇö±Ô");
			

		list2.add("±èµ¿ÇÑ");
		list2.add("À±È£ÁØ");
		list2.add("±èÀÎÈ¯");
		list2.add("¼­¿µÈÆ");
		list2.add("Á¤Àç¹Î");
		list2.add("±èµ¿Çö");
		list2.add("Á¤ÀÎ±Ô");
		list2.add("±èÁØÈ¯");
		

		for (int i = 0; i < 4; i++) {
			String team = "";
			for (int j = 0; j < 4; j++) {
				int k = (int)(Math.random()*list1.size());
				String name = list1.get(k);
				team += name+", " ;
				list1.remove(name);
			}
			System.out.println(i+1+"Á¶ : "+ team);
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
			System.out.println(i+1+"Á¶ : "+team);
		}
	}
}
