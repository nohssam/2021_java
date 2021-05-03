package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// DB 접속 필요한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs   = null ; // select문 결과 받는 클래스
		int result = 0 ;        // select문을 제외한 나머지 결과 받기 
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속 정보
			String url = "apackage com.ict09.jdbc;

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
jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문
			// customer테이블에서 custid가 7인 사람의 이름을 '박찬호', 주소를 '대한민국 서울'로 변경하자 
			String sql = "update customer set name='박찬호', address='대한민국 서울' where custid = 7";
			
			// 4. 실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 보내고 결과 받기
			//  select문이면 
			// rs = stmt.executeQuery(sql);
			
			//  select문이 아니면
			result = stmt.executeUpdate(sql);
			
			// System.out.println(result);
			if(result>0) {
				System.out.println("갱신 성공");
				
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
				System.out.println("갱신 실패-1");
			}
		} catch (Exception e) {
			System.out.println("update 실패-2");
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
