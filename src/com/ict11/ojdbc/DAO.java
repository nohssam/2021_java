package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO �� Data Access Object �� ���ڷμ� �������� DB�� �����ϴ� ��ü ���Ѵ�.
// DB�� ����� �����͸� ��ȸ�ϰų� �����ϴ� ����� �����ϵ��� �ϴ� ������Ʈ�� ���Ѵ�.
public class DAO {
	Connection conn ;
	PreparedStatement pstm;
	ResultSet rs ;
	int result ;
	
	// �̱��� ���� : ���α׷��� ���ۿ��� ���������� �ϳ��� ��ü�� ����ϴ� ������ ������ ���Ѵ�.
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao ;
	}
	
	// DB�� �����ϴ� ������ ���� �޼ҵ� 
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user ="c##ictedu01";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	// DB�� �����ؼ� ó���ϴ� �޼ҵ�� 
	// book table�� ��ü ���� ����
	public void getList() {
		try {
			// DB ���� 
			conn = getConnection();
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("��ȣ\t������\t\t���ǻ�\t\t\t����");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	
	// ����
	public void getInsert(int i_bookid,String i_bookname,
			String i_publisher,int i_price) {
		try {
			// DB ���� 
		    conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, i_bookid);
			pstm.setString(2, i_bookname);
			pstm.setString(3, i_publisher);
			pstm.setInt(4, i_price);
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("���Լ���");
			}
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	// ����
	public void getDelete(int d_bookid) {
		try {
			// DB ���� 
		    conn = getConnection();
			String sql = "delete from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, d_bookid);
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("��������");
			}
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	// ����
	public void getUpdate(int i_bookid,String i_bookname,
			String i_publisher,int i_price) {
		try {
			// DB ���� 
		    conn = getConnection();
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, i_bookname);
			pstm.setString(2, i_publisher);
			pstm.setInt(3, i_price);
			pstm.setInt(4, i_bookid);
			
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("��������");
			}
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// bookid �޾Ƽ� �˻��ϱ�
	public void getSelectOne(int s_bookid) {
		try {
			// DB ���� 
			conn = getConnection();
			String sql = "select * from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, s_bookid);
			rs = pstm.executeQuery();
			System.out.println("��ȣ\t������\t\t���ǻ�\t\t\t����");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
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













