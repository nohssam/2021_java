package com.ict11.ojdbc;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:while(true) {
			// book테이블의 전체 내용 보기 
			DAO.getInstance().getList();
			
			System.out.println("=================================");
			System.out.println("다음을 선택하세요");
			System.out.println("1.삽입하기");
			System.out.println("2.삭제하기");
			System.out.println("3.수정하기");
			System.out.println("4.검색하기");
			System.out.print("선택번호 : ");
			String su = scan.next();
			switch (su) {
			case "1":
				System.out.print("bookid : ");
				int i_bookid = scan.nextInt();
				
				System.out.print("bookname : ");
				String i_bookname = scan.next();
				
				System.out.print("publisher : ");
				String i_publisher = scan.next();
				
				System.out.print("price : ");
				int i_price = scan.nextInt();
				
				// 삽입하는 메소드 호출
				DAO.getInstance().getInsert(i_bookid, i_bookname, i_publisher, i_price);
				break;
			case "2":
				System.out.print("삭제할 bookid : ");
				int d_bookid = scan.nextInt();
				
				// 삭제할 메소드 호출
				DAO.getInstance().getDelete(d_bookid);
				break;
			case "3":
				System.out.print("bookid : ");
				int u_bookid = scan.nextInt();
				
				System.out.print("bookname : ");
				String u_bookname = scan.next();
				
				System.out.print("publisher : ");
				String u_publisher = scan.next();
				
				System.out.print("price : ");
				int u_price = scan.nextInt();
				
				// 수정할 메소드 호출
				DAO.getInstance().getUpdate(u_bookid, u_bookname, u_publisher, u_price);
				break;
			case "4":
				System.out.print("검색할 bookid : ");
				int s_bookid = scan.nextInt();
				
				// 검색할 메소드 호출
				DAO.getInstance().getSelectOne(s_bookid);
				break;
			}
			while(true) {
				System.out.print("계속할까요(y/n)? ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		
		System.out.println("최종 변경된 내용 입니다."); 
		DAO.getInstance().getList();
		System.out.println("수고하셨습니다.");
	}
}
