package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �����ϴ� 
		// �ڹ� API �̴�.
		
		// DB ó���� �ʿ��� Ŭ���� 3�� 
		Connection conn = null;
		// Statement�� ��ӹ��� �������̽� 
		PreparedStatement pstmt = null;
		// select ���� ����� ���� Ŭ������ cursor�� ����ؼ� ������ ������ �� �ִ�.
		ResultSet rs = null;
		// select ���� ������ ������ ����� ���� �� ��� 
		int result = 0 ;
		try {
			// 1. ����̹��ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. ��������(3��)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// ������ �ۼ�(select,insert,update,delete,...)
			String sql = "select * from book order by bookid";
			
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���� DB�� �����ϰ� ��� �ޱ� 
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getString("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
