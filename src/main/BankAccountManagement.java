package main;

import java.io.IOException;
import java.util.Scanner;

import main.service.bankaccount.BankAccountResult;
import main.service.bankaccount.BankAccountService;
import main.service.user.UserAccountResult;
import main.service.user.UserAccountService;

public class BankAccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountService bankAccountPresentation = new BankAccountService();
		UserAccountService userAccountPresentation = new UserAccountService();
		BankAccountResult brz;
		UserAccountResult uar;
		Scanner input = new Scanner(System.in);
		int choice = 0;
				
		 testUsersAndAccounts(); // testing all classes for account and user
		
		while (true) {

			
			
			System.out.println("1. users");
			System.out.println("2. accounts");
			System.out.println("0. exit");
			
			System.out.println();
			System.out.print("Enter your choice: ");
			
			
			choice = input.nextInt();
			
			switch (choice) {
				case 1: 
					usersMenu();
					break;
				case 2:	
					accountsMenu();
					break;
				case 0:
					System.out.print("Program closed...");
					return;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			//System.out.println(new String(new char[50]).replace("\0", "\r\n"));
		}
	}

	
	private static void usersMenu() {
		UserAccountService userAccountPresentation = new UserAccountService();
		UserAccountResult uar;
		String username, password;
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		// testUsersAndAccounts(); // testing all classes for account and user
		
		while (true) {
			System.out.println();
			System.out.println("1.1 Create user");
			System.out.println("1.2 Get user");
			System.out.println("1.3 Update user");
			System.out.println("1.4 Delete user");
			System.out.println("1.0 Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			
			choice = input.nextInt();

			System.out.println();
			System.out.println();

			
			switch (choice) {
				case 1: 
					System.out.print("Enter username: ");
					username = input.next();
					System.out.print("Enter password: ");
					password = input.next();
					userAccountPresentation.create(username, password);
					break;
				case 2:	
					System.out.print("Info for user: ");
					username = input.next();
					uar = userAccountPresentation.get(username);
					System.out.printf("-- information for user: %s, Password: %s %n%n%n", uar.getUser(), uar.getPassword());
					break;
				case 3:	
					System.out.print("Enter user for update: ");
					username = input.next();
					System.out.print("Enter password for update: ");
					password = input.next();
					userAccountPresentation.update(username, password);
					break;
				case 4:	
					System.out.print("Delete user: ");
					username = input.next();
					userAccountPresentation.delete(username);
					break;
				case 0:
					
					return;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	

	
	private static void accountsMenu() {
		BankAccountService bankAccountPresentation = new BankAccountService();
		BankAccountResult brz;
		Scanner input = new Scanner(System.in);
		int choice = 0;
		Long account, amount;
		
		// testUsersAndAccounts(); // testing all classes for account and user
		
		while (true) {
			System.out.println();
			System.out.println("2.1 Create account");
			System.out.println("2.2 Get account");
			System.out.println("2.3 Update account");
			System.out.println("2.4 Delete account");
			System.out.println("2.0 Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			
			choice = input.nextInt();
			
			System.out.println();
			System.out.println();
			
			switch (choice) {
				case 1: 
					System.out.print("Enter account number: ");
					account = input.nextLong();
					System.out.print("Enter amount: ");
					amount = input.nextLong();
					bankAccountPresentation.create(account, amount);
					break;
				case 2:	
					System.out.print("Info for account: ");
					account = input.nextLong();
					brz = bankAccountPresentation.get(account);
					System.out.printf("Account: %d, Amount: %d %n", brz.getAccnumber(), brz.getAmmount());
					break;
				case 3:	
					System.out.print("Update account: ");
					account = input.nextLong();
					System.out.print("Enter amount: ");
					amount = input.nextLong();
					bankAccountPresentation.update(account, amount);
					break;
				case 4:	
					System.out.print("Delete account: ");
					account = input.nextLong();
					bankAccountPresentation.delete(account);
					break;
				case 0:
					
					return;
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	
	
	
	// all classes test
	private static void testUsersAndAccounts() {
		BankAccountService bankAccountPresentation = new BankAccountService();
		UserAccountService userAccountPresentation = new UserAccountService();
		BankAccountResult brz;
		UserAccountResult uar;
		
		
		System.out.println("---------- TESTING ACCOUNTS ----------");
		System.out.println("-- adding accounts");
		bankAccountPresentation.create((long) 100);
		bankAccountPresentation.create((long) 101, (long) 555);
		bankAccountPresentation.create((long) 102);
		bankAccountPresentation.create((long) 103, (long) 999);
		
		brz = bankAccountPresentation.get((long) 100);
		System.out.printf("Account: %d, Amount: %d %n", brz.getAccnumber(), brz.getAmmount());
		
		brz = bankAccountPresentation.get((long) 103);
		System.out.printf("Account: %d, Amount: %d %n", brz.getAccnumber(), brz.getAmmount());

		brz = bankAccountPresentation.get((long) 101);
		System.out.printf("Account: %d, Amount: %d %n", brz.getAccnumber(), brz.getAmmount());

		brz = bankAccountPresentation.get((long) 102);
		System.out.printf("Account: %d, Amount: %d %n%n", brz.getAccnumber(), brz.getAmmount());

		// changing amount for account 100 to 45
		System.out.println("-- changing amount for account 100 to 45");
		bankAccountPresentation.update((long) 100,(long) 45); // update
		brz = bankAccountPresentation.get((long) 100);
		System.out.printf("Account: %d, Amount: %d %n%n", brz.getAccnumber(), brz.getAmmount());
		
		// -- deleting account 101
		System.out.println("-- deleting account 101 ");
		bankAccountPresentation.delete((long) 101);	// deleting
		brz = bankAccountPresentation.get((long) 101); // BOOM - account not found
		System.out.printf("Account: %d, Amount: %d %n%n", brz.getAccnumber(), brz.getAmmount()); // try to print deleted
		System.out.println();
		
		System.out.println("-- deleting account 101 AGAIN");
		bankAccountPresentation.delete((long) 101);	// deleting
		
				
		
		System.out.println();
		System.out.println("---------- TESTING USERS ----------");
		System.out.println("-- adding users");
		userAccountPresentation.create("admin", "password");
		userAccountPresentation.create("user1", "");
		userAccountPresentation.create("user2");
		userAccountPresentation.create("user3", "33333333");
		
		uar = userAccountPresentation.get("admin");
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());
		uar = userAccountPresentation.get("user1");
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());
		uar = userAccountPresentation.get("user2");
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());
		uar = userAccountPresentation.get("user3");
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());

		// updating user password
		System.out.println("-- changing password for user1 to [pw1] " );
		userAccountPresentation.update("user1", "pw1");
		uar = userAccountPresentation.get("user1");
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());
		
		// deleting user
		System.out.println("-- deleting [user2] ");
		userAccountPresentation.delete("user2");  // deleting user
		uar = userAccountPresentation.get("user2");  // try to get deleted user
		System.out.printf("User: %s, Password: %s %n", uar.getUser(), uar.getPassword());
		
	}
	

	/*
	public static void clear()
	    {
	        try
	        {
	            if (System.getProperty("os.name").contains("Windows"))
	                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	            else
	                Runtime.getRuntime().exec("clear");
	        } catch (IOException | InterruptedException ex) {}
	    }
	*/
	
	
	

}
