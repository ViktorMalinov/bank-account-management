package main.dataaccess.user;

public class UserAccount {
	private String user;
	private String password;
	

	public UserAccount() {
		this.user = "";
		this.password = "";
	}
	
	public UserAccount(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public UserAccount(String user) {
		this.user = user;
		this.password = "";
	}

	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
