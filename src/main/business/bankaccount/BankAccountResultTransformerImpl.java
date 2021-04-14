package main.business.bankaccount;

import java.util.Optional;

import main.dataaccess.bankaccount.BankAccount;
import main.service.bankaccount.BankAccountResult;

public class BankAccountResultTransformerImpl implements BankAccountResultTransformer {

	@Override
	public BankAccountResult transform(BankAccount ba) {
		BankAccountResult bar = new BankAccountResult(); 
		
		bar.setAccnumber(ba.getAccnumber());
		bar.setAmmount(ba.getAmmount());
		
		return bar;
	}

	@Override
	public BankAccountResult transform(Optional<BankAccount> ba) {
		BankAccountResult bar = new BankAccountResult(); 
		
		bar.setAccnumber(ba.get().getAccnumber());
		bar.setAmmount(ba.get().getAmmount());
		
		return bar;
	}

}
