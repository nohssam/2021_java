package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// JDBC에 필요한 3개 클래스 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null ; // select문 사용시 결과 받는 클래스
		int result = 0 ;     // select문이 아닐 경우 
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보(3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문 작성
			String sql = "insert into customer(custid, name, address, phone)"
					+ " values(9,'손흥민','영국 런던','000-9000-0001')";
			
			//4. 실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 보내고 결과 받기 
			// 이때 결과가 두가지다 (select문과 select문이 아닌 것(insert, update, delete)
			// select문인 경우
			// rs = stmt.executeQuery(sql);
			
			result = stmt.executeUpdate(sql);
			
			// 결과 보기 
			// System.out.println(result);
			if(result > 0) {
				System.out.println("삽입 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
				
			}else {
				System.out.println("삽입 실패-1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입 실패-2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
