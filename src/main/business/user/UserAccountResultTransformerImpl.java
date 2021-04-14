package main.business.user;

import java.util.Optional;

import main.dataaccess.user.UserAccount;
import main.service.user.UserAccountResult;

public class UserAccountResultTransformerImpl implements UserAccountResultTransformer {

	@Override
	public UserAccountResult transform(UserAccount ua) {
		UserAccountResult uar = new UserAccountResult(); 
		
		uar.setUser(ua.getUser());
		uar.setPassword(ua.getPassword());
		
		return uar;
	}

	@Override
	public UserAccountResult transform(Optional<UserAccount> ua) {
		UserAccountResult uar = new UserAccountResult();

		uar.setUser(ua.get().getUser());
		uar.setPassword(ua.get().getPassword());

		return uar;
	}

}
