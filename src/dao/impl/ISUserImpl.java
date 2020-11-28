package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.util.DBUtil;

import dao.client.ISUser;

public class ISUserImpl implements ISUser {

	@Override
	public String isStaffExist(String phone, String password) {
		try {
			//System.out.println("login staff");
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		String sql = "select name from staff where phoneNo = ? and password = ?";
		String[] params = {phone,password};
		ResultSet rs = null ;
		rs = DBUtil.executeQuery(sql, params);
		try {
			if(!rs.next()) {
				DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			String name = rs.getString("name");
			DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
			return name;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String isAdminExist(String phone, String password) {
		try {
			//System.out.println("search admin");
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		String sql = "select name from admin where phoneNo = ? and password = ?";
		String[] params = {phone,password};
		ResultSet rs = null ;
		rs = DBUtil.executeQuery(sql, params);
		try {
			if(!rs.next()) {
				DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			String name = rs.getString("name");
			DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
			return name;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String isClientExist(String phone, String password) {
		try {
			//System.out.println("login client");
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		String sql = "select name from client where phoneNo = ? and password = ?";
		String[] params = {phone,password};
		ResultSet rs = null ;
		rs = DBUtil.executeQuery(sql, params);
		try {
			if(!rs.next()) {
				DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			String name = rs.getString("name");
			DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
			return name;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean hasClient(String name, String phoneNo) {
		try {
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		String sql = "select * from client where phoneNo = ? and name = ?";
		String[] params = {phoneNo, name};
		ResultSet rs = null ;
		rs = DBUtil.executeQuery(sql, params);
		try {
			if(!rs.next()) {
				DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeAll(rs, DBUtil.pstmt, DBUtil.connection);
		return true;
	}
	
	

}
