package main.business.bankaccount;

import java.util.Optional;

import main.dataaccess.bankaccount.BankAccount;
import main.dataaccess.bankaccount.BankAccountDao;
import main.dataaccess.bankaccount.BankAccountDaoListImpl;
import main.service.bankaccount.BankAccountParam;
import main.service.bankaccount.BankAccountResult;

public class BankAccountProcessorImpl implements BankAccountProcessor {

	private BankAccountDao  bankAccountDao = new BankAccountDaoListImpl();
	private BankAccountParamTransformer paramTransformer = new BankAccountParamTransformerImpl(); 
	private BankAccountResultTransformer resultTransformer = new BankAccountResultTransformerImpl();
	
	@Override
	public BankAccountResult create(BankAccountParam bap) {
		BankAccount acc = paramTransformer.transform(bap);
		acc = bankAccountDao.create(acc);
		BankAccountResult bar = resultTransformer.transform(acc); 
		return bar;
	}

	@Override
	public BankAccountResult get(Long accnumber) {
		Optional <BankAccount> acc = bankAccountDao.get(accnumber);
		BankAccountResult bar = resultTransformer.transform(acc);
		return bar;
	}

	@Override
	public void update(BankAccountParam bap) {
		BankAccount ba = paramTransformer.transform(bap);
		bankAccountDao.update( ba );
	}

	@Override
	public void delete(Long accnumber) {
		bankAccountDao.delete(accnumber);
	}

}
