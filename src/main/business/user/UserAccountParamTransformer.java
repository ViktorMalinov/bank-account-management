package main.business.user;


import main.dataaccess.user.UserAccount;
import main.service.user.UserAccountParam;

public interface UserAccountParamTransformer {

	UserAccount transform(UserAccountParam uap);
}
