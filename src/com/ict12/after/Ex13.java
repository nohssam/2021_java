package com.ict12.after;

public class Ex13 {
	public static void main(String[] args) {
		// break label문 : 레이블이 지정한 블록 탈출할때 사용
		// continue label 문 : continue문 이하의 수행문을 포기하고
		// 레이블이 지정한 반복문의 다음 회차를 실행
		// 단순 for문일때는 break과 break label이 같은 효과라서 break label를 사용할 이유가 없다.
		// (continue문도 같음)

		// break
		for (int i = 1; i < 100; i++) {
			if (i == 6)
				break;
			System.out.println(i);
		}
		System.out.println();

		esc: // 레이블
		for (int i = 1; i < 100; i++) {
			if (i == 6)
				break esc;
			System.out.println(i);
		}
		System.out.println("=========================");

		// 다중 for문일 경우
		// j가 3일때 break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)	break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("---------------");
		esc1: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)	break esc1;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("=========================");
		// 다중 for문일 경우
		// j가 3일때 continue;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)	continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("---------------");
		esc2: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)	continue esc2;
				System.out.println("i=" + i + ", j=" + j);
			}
		}

	}
}
