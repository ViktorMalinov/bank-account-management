package main.business.bankaccount;

import main.dataaccess.bankaccount.BankAccount;
import main.service.bankaccount.BankAccountParam;

public class BankAccountParamTransformerImpl implements BankAccountParamTransformer {

	@Override
	public BankAccount transform(BankAccountParam bap) {
		BankAccount ba = new BankAccount();
		
		ba.setAccnumber(bap.getAccnumber());
		ba.setAmmount(bap.getAmmount());
		
		return ba;
	}

}
