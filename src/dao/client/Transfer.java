package dao.client;

public interface Transfer {
	
	/**
	 * 检测余额是否充足
	 */
	boolean enoughBalance(int amount, String phoneNo);
	
	/**
	 * 检测收款人是否存在
	 */
	boolean hasClient(String name, String phoneNo);
	
	/**
	 * 完成转账操作
	 */
	String transfer(int amount, String myPhoneNo, String name, String phoneNo);
}
