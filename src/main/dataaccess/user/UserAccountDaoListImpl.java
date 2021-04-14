package main.dataaccess.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserAccountDaoListImpl implements UserAccountDao {

	private static List<UserAccount> datasource = new ArrayList<UserAccount>();
	
	
	@Override
	public UserAccount create(UserAccount ua) {
		datasource.add(ua);
		return ua;
	}

	@Override
	public Optional<UserAccount> get(String user) {
		return datasource.stream().filter(usr -> usr.getUser().equals(user)).findFirst();
	}

	
	@Override
	public void update(UserAccount ua) {
		for (int i = 0; i < datasource.size(); i++) {
			if ( datasource.get(i).getUser().equals(ua.getUser()) ) {
				datasource.set(i, ua);
				System.out.printf("-- user: %s found, updated %n", ua.getUser());
				return;
			}
		}
		System.out.printf("-- user: %s not found %n", ua.getUser());

	}

	@Override
	public void delete(String user) {
		for (int i = 0; i < datasource.size(); i++) {
			if ( datasource.get(i).getUser().equals(user) ) {
				datasource.remove(i);
				System.out.printf("-- user: %s was removed %n", user);
				return;
			}
		}
		System.out.printf("-- user: %s not found %n", user);

	}

}
