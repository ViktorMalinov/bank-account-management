package main.service.bankaccount;

public class BankAccountParam {
	private Long accnumber;
	private Long ammount;

	
	public BankAccountParam(Long accnumber, Long ammount) {
		this.accnumber = accnumber;
		this.ammount = ammount;
	}

	public BankAccountParam(Long accnumber) {
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
