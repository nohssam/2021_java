package com.ict12.after;

public class Ex04 {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일때만 실행한다.
		//              거짓일때는 if문 무시
		// 형식 : if(조건식){
		//          조건식이 참일때 실행할 문장 ;
		//          조건식이 참일때 실행할 문장 ;
		//         }
		//        단, 실행할 문장이 한 줄이면 { } (블록) 생략 가능
		
		// double avg 가 60이상이면 합격, 아니면 불합격
		double avg = 50;
		String res = "초기값"; 
		if(avg >=60) {
			res = "합격";
		}
		if(avg<60) {
			res = "불합격";
		}
		System.out.println(res);
		System.out.println("======================");
		
		String res2 = "불합격"; // 조건이 참이 아닐 것에 대한 결과를 초기값에 넣는다.
		if(avg >=60) {
			res2 = "합격";
		}
		System.out.println(res2);
		System.out.println("======================");
		
		// int k1 이 홀수인지 짝수인지 판별하자 
		int k1 = 46;
		String res3 = "홀수";
		if(k1%2==0) {
			res3 = "짝수";
		}
		System.out.println(res3);
		
		
	}
}










