package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 출판사를 받아서 해당 출판사가 출판한 도서 정보 모두를 출력하기 
public class Ex02 {
	public static void main(String[] args) {
		// Scanner를 이용해서 출판사의 정보를 받자
		Scanner scan = new Scanner(System.in);
		System.out.print("출판사를 입력하세요 >> ");
		String msg = scan.next();
		
		// DB 처리에 필요한 클래스 
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;  // select문
		int result = 0 ;      // select문을 제외한 나머지 
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속정보 3개 
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user ="c##ictedu01";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
			// 쿼리 작성
			String sql = "select * from book where publisher like ? order by bookid";
			pstm = conn.prepareStatement(sql);
			// ? => 바인딩 변수 
			pstm.setString(1, "%"+msg+"%");
			rs = pstm.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
