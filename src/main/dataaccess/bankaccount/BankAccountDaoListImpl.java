package main.dataaccess.bankaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankAccountDaoListImpl implements BankAccountDao {

	private static List<BankAccount>  datasource = new ArrayList<BankAccount>();
	
	
	@Override
	public BankAccount create(BankAccount ba) {
		datasource.add(ba);		
		return ba;
	}

	@Override
	public Optional<BankAccount> get(Long accnumber) {
		return datasource.stream().filter(acc -> acc.getAccnumber().equals(accnumber)).findFirst();
	}

	@Override
	public void update(BankAccount ba) {
		for (int i = 0; i < datasource.size(); i++) {
			if ( datasource.get(i).getAccnumber() == ba.getAccnumber() ) {
				datasource.set(i, ba);
				System.out.printf("-- account: %d found %n", ba.getAccnumber());
				return;
			}
		}
		System.out.printf("-- account: %d not found %n", ba.getAccnumber());
	}

	@Override
	public void delete(Long accnumber) {
		for (int i = 0; i < datasource.size(); i++) {
			if ( datasource.get(i).getAccnumber() == accnumber ) {
				datasource.remove(i);
				System.out.printf("-- account: %d was removed %n", accnumber);
				return;
			}
		}
		System.out.printf("-- account: %d not found %n", accnumber);
	}

}
