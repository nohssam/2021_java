package com.ict11.ojdbc2;

import java.util.ArrayList;

// 결과를 출력하는 클래스
public class Ex02 {

	public void prn(ArrayList<VO> list) {
		System.out.println("번호\t도서 이름\t출판사\t가격");
		for (VO k : list) {
			System.out.print(k.getBookid()+"\t");
			System.out.print(k.getBookname()+"\t");
			System.out.print(k.getPublisher()+"\t");
			System.out.println(k.getPrice());
		}
	}
}
