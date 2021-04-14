package main.service.bankaccount;

public class BankAccountResult {

	private Long accnumber;
	private Long ammount;

	public BankAccountResult() {
		this.accnumber = (long) 0.0;
		this.ammount = (long) 0.0;
	}

	
	public BankAccountResult(Long accnumber, Long ammount) {
		this.accnumber = accnumber;
		this.ammount = ammount;
	}

	public BankAccountResult(Long accnumber) {
		this.accnumber = accnumber;
		this.ammount = (long) 0.0;
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
