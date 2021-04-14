package main.service.user;

import java.util.NoSuchElementException;

import main.business.user.UserAccountProcessor;
import main.business.user.UserAccountProcessorImpl;

public class UserAccountService {

	UserAccountProcessor userAccountProcessor = new UserAccountProcessorImpl();
	
	public UserAccountResult create(String user) {
		UserAccountParam ua = new UserAccountParam(user);
		return userAccountProcessor.create(ua);
	}

	public UserAccountResult create(String user, String password) {
		UserAccountParam ua = new UserAccountParam(user, password);
		return userAccountProcessor.create(ua);
	}

	
	public UserAccountResult get(String user) {
		try {
			return userAccountProcessor.get(user);
		}
		catch (NoSuchElementException e) {
			System.out.printf("-- user: %s NOT FOUND (get exeption) %n", user);
			return new UserAccountResult("********","********");
		}
		
	}
	
	public void update(String user, String password) {
		userAccountProcessor.update(new UserAccountParam(user, password));
	}
	
	
	public void delete(String user) {
		userAccountProcessor.delete(user);
	}
	
	
	
	
}
