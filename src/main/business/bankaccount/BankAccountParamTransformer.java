package main.business.bankaccount;

import main.dataaccess.bankaccount.BankAccount;
import main.service.bankaccount.BankAccountParam;

public interface BankAccountParamTransformer {

	BankAccount transform(BankAccountParam bap);
}
