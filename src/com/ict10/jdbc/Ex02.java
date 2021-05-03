package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
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
			// String sql = "select * from book where bookid = ?";
			String sql = "select * from book where publisher like ?";
			// ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			// ���ε����� ó�� 
			// pstmt.setInt(1, 3);
			pstmt.setString(1, "%�̻�%");
			
			// ���� DB�� �����ϰ� ��� �ޱ� 
			// �������� select ���̸� executeQuery()
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
