package main.business.user;

import java.util.Optional;

import main.dataaccess.user.UserAccount;
import main.dataaccess.user.UserAccountDao;
import main.dataaccess.user.UserAccountDaoListImpl;
import main.service.user.UserAccountParam;
import main.service.user.UserAccountResult;

public class UserAccountProcessorImpl implements UserAccountProcessor {
	private UserAccountDao userAccountDao = new UserAccountDaoListImpl();
	private UserAccountParamTransformer paramTransformer = new UserAccountParamTransformerImpl(); 
	private UserAccountResultTransformer resultTransformer = new UserAccountResultTransformerImpl();  
	
	@Override
	public UserAccountResult create(UserAccountParam uap) {
		UserAccount ua = paramTransformer.transform(uap);
		ua = userAccountDao.create(ua);
		UserAccountResult uar = resultTransformer.transform(ua);
		return uar;
	}

	@Override
	public UserAccountResult get(String user) {
		Optional<UserAccount> ua = userAccountDao.get(user);
		UserAccountResult uar = resultTransformer.transform(ua);
		return uar;
	}

	@Override
	public void update(UserAccountParam uap) {
		UserAccount ua = paramTransformer.transform(uap);
		userAccountDao.update(ua);

	}

	@Override
	public void delete(String user) {
		userAccountDao.delete(user);

	}

}
