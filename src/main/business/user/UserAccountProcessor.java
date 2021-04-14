package main.business.user;

import main.service.user.UserAccountParam;
import main.service.user.UserAccountResult;


public interface UserAccountProcessor {

	UserAccountResult create(UserAccountParam ua);
	UserAccountResult get(String user);
	void update(UserAccountParam ua);
	void delete(String user);
	
	
}
