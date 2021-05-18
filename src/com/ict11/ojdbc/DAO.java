package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// DAO 란 Data Access Object 의 약자로서 실질적인 DB에 접근하는 객체 말한다.
// DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 하는 오브젝트를 말한다.
public class DAO {
	Connection conn ;
	PreparedStatement pstm;
	ResultSet rs ;
	int result ;
	
	// 싱글턴 패턴 : 프로그램이 시작에서 끝날때까지 하나의 객체만 사용하는 디자인 패턴을 말한다.
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao ;
	}
	
	// DB에 접속하는 역할을 수행 메소드 
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
	
	// DB에 접근해서 처리하는 메소드들 
	// book table의 전체 내용 보기
	public void getList() {
		try {
			// DB 접속 
			conn = getConnection();
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			System.out.println("번호\t도서명\t\t출판사\t\t\t가격");
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
	
	// 삽입
	public void getInsert(int i_bookid,String i_bookname,
			String i_publisher,int i_price) {
		try {
			// DB 접속 
		    conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, i_bookid);
			pstm.setString(2, i_bookname);
			pstm.setString(3, i_publisher);
			pstm.setInt(4, i_price);
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("삽입성공");
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
	// 삭제
	public void getDelete(int d_bookid) {
		try {
			// DB 접속 
		    conn = getConnection();
			String sql = "delete from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, d_bookid);
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("삭제성공");
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
	// 수정
	public void getUpdate(int i_bookid,String i_bookname,
			String i_publisher,int i_price) {
		try {
			// DB 접속 
		    conn = getConnection();
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, i_bookname);
			pstm.setString(2, i_publisher);
			pstm.setInt(3, i_price);
			pstm.setInt(4, i_bookid);
			
			result = pstm.executeUpdate();
			if(result>0) {
				System.out.println("수정성공");
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
	
	// bookid 받아서 검색하기
	public void getSelectOne(int s_bookid) {
		try {
			// DB 접속 
			conn = getConnection();
			String sql = "select * from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, s_bookid);
			rs = pstm.executeQuery();
			System.out.println("번호\t도서명\t\t출판사\t\t\t가격");
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













