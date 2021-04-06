package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		// 나라정보를 받으면 해당 나라의 수도를 출력하는 프로그램
		
		// 1. 나라와 수도를 가지고 있는 데이터
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("KOREA", "서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "북경");
		map.put("일본", "동경");
		map.put("태국", "방콕");
		map.put("캐나다", "어타와");
		
		// 나라(key)를 set컬렉션에 넣어다. 
		Set<String> sets = map.keySet();
		
		Scanner scan = new Scanner(System.in);
		
		esc:
		while (true) {
			System.out.print("나라 : ");
			String msg = scan.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg +"의 수도는 "+result+" 입니다.");
			}else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			
			while(true) {
				System.out.print("계속할까요?(y/n)");
				String str = scan.next();
				if(str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("잘못입력하셨네요");
					System.out.println("다시 입력하세요");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}









