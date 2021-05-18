package com.ict11.ojdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// DAO란 Data Access Object의 약어로서  DB 를 사용해 데이터를 조회하거나 
//       조작하는 기능을 전담하도록 만든 오브젝트
//      (CRUD => Create, Reader, Update, Delete ) 
public class DAO {
	Connection conn;
	PreparedStatement pstm ;
	ResultSet rs;
	int result;
	
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao;
	}
	
	// DB에 접속하는 역할을 수행하는 메소드 
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user = "c##ictedu01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
		}
		return null;
	}
	
	// DB처리하는 메소드들 : return이 존재 (ArrayList<VO> )
	// 전체보기 
	public ArrayList<VO> getList(){
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from book order by bookid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				VO vo = new VO();
				vo.setBookid(rs.getInt("bookid"));
				vo.setBookname(rs.getString("bookname"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		} finally {
			try {
		     	rs.close();
		     	pstm.close();
		     	conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}
	public int getInsert(int bookid, String bookname, String publisher, int price){
		try {
			conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, bookid);
			pstm.setString(2, bookname);
			pstm.setString(3, publisher);
			pstm.setInt(4, price);
			result = pstm.executeUpdate();
			
			return result;
		} catch (Exception e) {
		} finally {
			try {
		     	pstm.close();
		     	conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	public int getDelete(int bookid){
		try {
			conn = getConnection();
			String sql = "delete from book where bookid = ?";
			
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, bookid);
			result = pstm.executeUpdate();
			
			return result;
		} catch (Exception e) {
		} finally {
			try {
		     	pstm.close();
		     	conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	public int getUpdate(int bookid, String bookname, String publisher, int price){
		try {
			conn = getConnection();
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, bookname);
			pstm.setString(2,publisher);
			pstm.setInt(3, price);
			pstm.setInt(4, bookid);
			result = pstm.executeUpdate();
			
			return result;
		} catch (Exception e) {
		} finally {
			try {
		     	pstm.close();
		     	conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	public ArrayList<VO> getSelectOne(int bookid){
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from book where bookid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, bookid);
			rs = pstm.executeQuery();
			while(rs.next()) {
				VO vo = new VO();
				vo.setBookid(rs.getInt("bookid"));
				vo.setBookname(rs.getString("bookname"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		} finally {
			try {
		     	rs.close();
		     	pstm.close();
		     	conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}
}









