package main.service.user;

public class UserAccountResult {
	private String user;
	private String password;
	

	public UserAccountResult() {
		this.user = "";
		this.password = "";
	}
	
	public UserAccountResult(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public UserAccountResult(String user) {
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
