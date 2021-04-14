package main.business.bankaccount;

import main.service.bankaccount.BankAccountParam;
import main.service.bankaccount.BankAccountResult;

public interface BankAccountProcessor {

	BankAccountResult create(BankAccountParam ba);
	BankAccountResult get(Long accnumber);
	void update(BankAccountParam ba);
	void delete(Long accnumber);
}
