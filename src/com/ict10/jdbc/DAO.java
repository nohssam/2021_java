package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO�� Data Access Object�� ���μ� ���������� DB�� �����ϴ� ��ü�� ���Ѵ�.
// DAO�� ��� ������ ȿ������ Ŀ�ؼ� ������ ���ȼ� �����̴�.
// DAO(Data Access Object)�� DB�� ����� �����͸� ��ȭ�ϰų�
//                           �����ϴ� ����� �����ϵ��� ���� ������Ʈ�� ���Ѵ�.
public class DAO {
   Connection conn ;
   PreparedStatement pstmt;
   ResultSet rs ;
   int result ;
   
   // DB�� �����ϴ� ������ �����Ѵ�.
   public DAO() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
		String user = "test01";
		String password = "1111";
		conn = DriverManager.getConnection(url, user, password);
	} catch (Exception e) {
		System.out.println(e);
	}
   }
   
   // ���� DB���� �޼ҵ带 ������ 
   // ��ü ���� ����ϴ� �޼ҵ� 
   public void getList() {
	   try {
		   String sql = "select * from book order by bookid";
		   pstmt = conn.prepareStatement(sql);
	       rs = pstmt.executeQuery();
	       System.out.println("������ȣ\t������\t���ǻ�\t����");
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
			 pstmt.close();
			 conn.close();
		} catch (Exception e2) {
		}
	  } 
   }  // �޼ҵ� ��
   
   // �����ϴ� �޼ҵ�
   public void getInsert(int i_bookid, String i_bookname, String i_publisher, int i_price) {
	   try {
		   String sql = "insert into book values(?,?,?,?)";
		   pstmt = conn.prepareStatement(sql);
		   pstmt.setInt(1, i_bookid);
	       pstmt.setString(2,i_bookname);
	       pstmt.setString(3, i_publisher);
	       pstmt.setInt(4, i_price);
	       result = pstmt.executeUpdate();
	       
	       if(result >0) {
	    	   System.out.println("���Լ���");
	       }
	       
	   } catch (Exception e) {
		System.out.println(e);
	   } finally {
		  try {
			 pstmt.close();
			 conn.close();
		} catch (Exception e2) {
		}
	  } 
   }  // �޼ҵ� ��
   // �����ϴ� �޼ҵ�
   public void getDelete(int i_bookid) {
	   try {
		   String sql = "delete from book where bookid = ?";
		   pstmt = conn.prepareStatement(sql);
	       pstmt.setInt(1,i_bookid);
	       result = pstmt.executeUpdate();
	       if(result >0) {
	    	   System.out.println("��������");
	       }
	   } catch (Exception e) {
		System.out.println(e);
	   } finally {
		  try {
			 pstmt.close();
			 conn.close();
		} catch (Exception e2) {
		}
	  } 
   }  // �޼ҵ� ��
   // �˻��ϴ� �޼ҵ� 
   public void getSelect(int i_bookid) {
	   try {
		   String sql = "select * from book where bookid = ?";
		   pstmt = conn.prepareStatement(sql);
	       pstmt.setInt(1,i_bookid);
	       rs = pstmt.executeQuery();
	       System.out.println("������ȣ\t������\t���ǻ�\t����");
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
			 pstmt.close();
			 conn.close();
		} catch (Exception e2) {
		}
	  } 
   }  // �޼ҵ� ��
   // �����ϴ� �޼ҵ�
   public void getUpdate(int i_bookid, String i_bookname, String i_publisher, int i_price) {
	   try {
		   String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
		   pstmt = conn.prepareStatement(sql);
	       pstmt.setString(1,i_bookname);
	       pstmt.setString(2, i_publisher);
	       pstmt.setInt(3, i_price);
	       pstmt.setInt(4, i_bookid);
	       result = pstmt.executeUpdate();
	       
	       if(result >0) {
	    	   System.out.println("��������");
	       }
	       
	   } catch (Exception e) {
		System.out.println(e);
	   } finally {
		  try {
			 pstmt.close();
			 conn.close();
		} catch (Exception e2) {
		}
	  } 
   }  // �޼ҵ� ��
   // �˻��ϴ� �޼ҵ� 
   
   
}













