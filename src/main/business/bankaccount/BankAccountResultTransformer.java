package main.business.bankaccount;

import java.util.Optional;

import main.dataaccess.bankaccount.BankAccount;
import main.service.bankaccount.BankAccountResult;

public interface BankAccountResultTransformer {

	public BankAccountResult transform(BankAccount ba);
	public BankAccountResult transform(Optional<BankAccount> ba);
}
