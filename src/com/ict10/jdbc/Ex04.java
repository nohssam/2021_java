package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ���� bookid�� �ޱ� ���ؼ� Scanner ���
		Scanner scan = new Scanner(System.in);
		System.out.print("������ idx�� �Է��ϼ��� >> ");
		int del_id = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, del_id);
			result = pstmt.executeUpdate();
			
			if(result>0) {
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt("bookid")+"\t");
					System.out.print(rs.getString("bookname")+"\t");
					System.out.print(rs.getString("publisher")+"\t");
					System.out.println(rs.getString("price"));
				}
			}else {
				System.out.println("������ id�� �������� �ʽ��ϴ�.");
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
