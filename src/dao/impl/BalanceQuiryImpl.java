package dao.impl;

import java.sql.SQLException;

import org.util.DBUtil;

import dao.client.BalanceQuiry;

public class BalanceQuiryImpl implements BalanceQuiry{

	@Override
	public int banlance(String phoneNo) {
		
		int balance = 0;
		String[] params = {phoneNo};
		DBUtil.rs = DBUtil.executeQuery("select balance from client where phoneNo=?", params);
		try {
			while (DBUtil.rs.next()) {
				balance = DBUtil.rs.getInt("balance");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeAll(DBUtil.rs, DBUtil.pstmt, DBUtil.connection);
		return balance;
	}
	
	
}
