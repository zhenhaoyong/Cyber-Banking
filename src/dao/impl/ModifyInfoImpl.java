/**
 * 
 */
package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.util.DBUtil;

import dao.client.ModifyInfo;

/**
 * @author admin
 *
 */
public class ModifyInfoImpl implements ModifyInfo {

	@Override
	public boolean hasEmail(String email) {
		try {
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		String sql = "select * from client where email=?";
		String[] params = {email};
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

	@Override
	public boolean hasPhone(String phoneNo) {
		try {
			DBUtil.connection = DBUtil.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		String sql = "select * from client where phoneNo=?";
		String[] params = {phoneNo};
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

	@Override
	public String modifyInfo(String nPhone, String phoneNo, String email, String password) {
		
		if (!nPhone.equals(phoneNo)) {
			if (this.hasPhone(phoneNo)) {
				return "The phoneNo has bound";
			} else {
				Object[] params = {phoneNo, nPhone};
				DBUtil.executeUpdate("update Client set phoneNo=? where phoneNo=?", params);
				nPhone = phoneNo;
			}
		}
		
		if (!email.equals(this.quiryEmail(nPhone))) {
			if (this.hasEmail(email)) {
				return "The email has bound";
			} else {
				Object[] params = {email, nPhone};
				DBUtil.executeUpdate("update Client set email=? where phoneNo=?", params);
			}
		}
		
		Object[] params = {password, nPhone};
		DBUtil.executeUpdate("update Client set password=? where phoneNo=?", params);

		DBUtil.closeAll(DBUtil.rs, DBUtil.pstmt, DBUtil.connection);
		
		return "sucess";
	}

	@Override
	public String quiryEmail(String phoneNo) {
		String email = null;
		String[] params = {phoneNo};
		DBUtil.rs = DBUtil.executeQuery("select email from client where phoneNo=?", params);
		try {
			while (DBUtil.rs.next()) {
				email = DBUtil.rs.getString("email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeAll(DBUtil.rs, DBUtil.pstmt, DBUtil.connection);
		return email;
	}

	@Override
	public String quiryPassword(String phoneNo) {
		String password = null;
		String[] params = {phoneNo};
		DBUtil.rs = DBUtil.executeQuery("select password from client where phoneNo=?", params);
		try {
			while (DBUtil.rs.next()) {
				password = DBUtil.rs.getString("password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeAll(DBUtil.rs, DBUtil.pstmt, DBUtil.connection);
		return password;
	}
	
	

}
