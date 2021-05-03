package com.ict10.jdbc;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		esc:while(true) {
			DAO dao = new DAO();
			dao.getList();
			System.out.println("=========================================");
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
					
					// next() 띄어쓰기 못함
					System.out.print("bookname : ");
					String i_bookname = scan.next();
					
					System.out.print("publisher : ");
					String i_publisher = scan.next();
					
					System.out.print("price : ");
					int i_price = scan.nextInt();
					
					// 삽입하는 메소드 
					DAO i_dao  = new DAO();
					i_dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
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
					// 수정하는 메소드 
					DAO u_dao = new DAO();
					u_dao.getUpdate(u_bookid, u_bookname, u_publisher, u_price);
					break;
				case "2": 
					System.out.println("삭제할 bookid : ");
				    int delete_id = scan.nextInt(); 
				    // 삭제할 메소드
				    DAO d_dao = new DAO();
				    d_dao.getDelete(delete_id);
				    break;
				case "4": 
					System.out.println("검색할 id : "); 
				    int select_id = scan.nextInt(); 
				    // 검색할 메소드 
				    DAO r_dao = new DAO();
				    r_dao.getSelect(select_id);
				    break;
			    default: 
			    	System.out.println("제대로 선택하세요");
			    	continue esc ;
			}
			while(true) {
				System.out.print("계속할까요(y/n) ? ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue ;
				}
			}
			
		}
		System.out.println("변경된 내용입니다.");
		DAO dao = new DAO();
		dao.getList();
		
	}
}

