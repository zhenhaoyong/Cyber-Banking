package dao.client;

public interface ISUser {
	
	public String isStaffExist(String phone,String password);
	
	public String isAdminExist(String phone,String password);

	public String isClientExist(String phone, String password) ;
	
	public boolean hasClient(String name, String phoneNo);
}
