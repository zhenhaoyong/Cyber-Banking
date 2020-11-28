package dao.client;

public interface ModifyInfo {
	
	boolean hasEmail(String email);
	
	boolean hasPhone(String phoneNo);
	
	String quiryEmail(String phoneNo);
	
	String quiryPassword(String phoneNo);
	
	String modifyInfo(String nPhone, String phoneNo, String email, String password); 
}
