package main.business.user;

import java.util.Optional;
import main.dataaccess.user.UserAccount;
import main.service.user.UserAccountResult;

public interface UserAccountResultTransformer {

	public UserAccountResult transform(UserAccount ua);
	public UserAccountResult transform(Optional<UserAccount> ua);
}
