package com.ict12.after;

public class Ex12 {
	public static void main(String[] args) {
		// break문 : 현재 반복문을 탈출할때 사용
		// continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 실행
		//              for문의 경우는 증감식,   while문일때는 사용하지 말자

		// 1-10 까지 출력할 때 i가 4일때 break;
		for (int i = 1; i < 11; i++) {
			if(i==4) break;
			System.out.println(i);
		}
		System.out.println("==================");
		
		// 1-10 까지 출력할 때 i가 4일때 continue ;
		for (int i = 1; i < 11; i++) {
			if(i==4) continue;
			System.out.println(i);
		}
		System.out.println("==================");
		
		// 이중 for문에서 break, continue 사용
		//   j가 3일때 break, continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;
				System.out.println("i=" + i + ", j="+ j);
			}
		}
		System.out.println("==================");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;
				System.out.println("i=" + i + ", j="+ j);
			}
		}
		System.out.println("==================");
		
	}
}












