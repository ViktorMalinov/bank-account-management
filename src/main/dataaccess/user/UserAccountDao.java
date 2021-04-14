package main.dataaccess.user;

import java.util.Optional;

public interface UserAccountDao {
	UserAccount create(UserAccount ua);
	Optional<UserAccount> get(String user);
	void update(UserAccount ua);
	void delete(String user);
}
