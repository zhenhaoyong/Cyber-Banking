package dao.impl;

import org.util.DBUtil;

import dao.client.BalanceQuiry;
import dao.client.ISUser;
import dao.client.Transfer;

public class TransferImpl implements Transfer {
	
	BalanceQuiry bq = new BalanceQuiryImpl();
	ISUser iu = new ISUserImpl();
	
	@Override
	public boolean enoughBalance(int amount, String phoneNo) {
		
		int balance = bq.banlance(phoneNo);
		
		return balance >= amount;
	}

	@Override
	public boolean hasClient(String name, String phoneNo) {
		return iu.hasClient(name, phoneNo);
	}

	@Override
	public String transfer(int amount, String myPhoneNo, String name, String phoneNo) {
		
		if(!this.enoughBalance(amount, myPhoneNo)) {
			return "notEnough";
		}
		
		if(!this.hasClient(name, phoneNo)) {
			return "noClient";
		}
		
		int balance = bq.banlance(myPhoneNo);
		balance -= amount;
		Object[] params = {balance, myPhoneNo};
		DBUtil.executeUpdate("update Client set balance=? where phoneNo=?", params);
		
		balance = bq.banlance(phoneNo);
		balance += amount;
		params[0] = balance;
		params[1] = phoneNo;
		DBUtil.executeUpdate("update Client set balance=? where phoneNo=?", params);
		
		DBUtil.closeAll(DBUtil.rs, DBUtil.pstmt, DBUtil.connection);
		return "success";
	}

}
