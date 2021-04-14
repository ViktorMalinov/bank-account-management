package main.dataaccess.bankaccount;

public class BankAccount {

	private Long accnumber;
	private Long ammount;
	
	public BankAccount() {
		this.accnumber = (long) 0.0;
		this.ammount =  (long) 0.0;
	}
	
	public BankAccount(Long accnumber) {
		this.accnumber = accnumber;
		this.ammount =  (long) 0.0;
	}

	public BankAccount(Long accnumber, Long ammount) {
		this.accnumber = accnumber;
		this.ammount =  ammount;
	}

	public Long getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(Long accnumber) {
		this.accnumber = accnumber;
	}

	public Long getAmmount() {
		return ammount;
	}

	public void setAmmount(Long ammount) {
		this.ammount = ammount;
	}

	
}
