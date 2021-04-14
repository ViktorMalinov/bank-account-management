package main.business.user;

import main.dataaccess.user.UserAccount;
import main.service.user.UserAccountParam;

public class UserAccountParamTransformerImpl implements UserAccountParamTransformer {

	@Override
	public UserAccount transform(UserAccountParam uap) {
		UserAccount ua = new UserAccount();
		
		ua.setUser(uap.getUser());
		ua.setPassword(uap.getPassword());
		
		return ua;
	}

}
