package main.dataaccess.bankaccount;

import java.util.Optional;

public interface BankAccountDao {

	BankAccount create(BankAccount ba);
	Optional<BankAccount> get(Long accnumber);
	void update(BankAccount ba);
	void delete(Long accnumber);
}
