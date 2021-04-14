package main.service.bankaccount;

import java.util.NoSuchElementException;

import main.business.bankaccount.BankAccountProcessor;
import main.business.bankaccount.BankAccountProcessorImpl;


public class BankAccountService {

	private BankAccountProcessor bankAccountProcessor = new BankAccountProcessorImpl();

	public BankAccountResult create(Long accnumber) {
		BankAccountParam bap = new BankAccountParam(accnumber); 
		return bankAccountProcessor.create(bap);
	}

	public BankAccountResult create(Long accnumber, Long ammount) {
		BankAccountParam bap = new BankAccountParam(accnumber, ammount); 
		return bankAccountProcessor.create(bap);
	}

	
	public BankAccountResult get(Long accnumber) {
		try {
			return bankAccountProcessor.get(accnumber);	
		}
		catch (NoSuchElementException e) {
			System.out.printf("-- account: %d NOT FOUND (get exeption) %n", accnumber);
			return new BankAccountResult((long) -1,(long) -1);
		}
		
	}
	
	public void update(Long accnumber, Long ammount ) {
		bankAccountProcessor.update(new BankAccountParam(accnumber, ammount));
	}
	
	public void delete(Long accnumber) {
		bankAccountProcessor.delete(accnumber);
	}
	
}
