package main.java.com.abmf.kickstart.models.bankaccount;

public class BankAccountImplemented extends BankAccount {

	public BankAccountImplemented() {
		bankName = "";
		userName = "";
		totalQuantity = 0;
		id = 0;
		localization = "";
	}
	
	public BankAccountImplemented(String bankName, String userName, long id, String localization) {
		this.bankName = bankName;
		this.userName = userName;
		this.totalQuantity = 0;
		this.id = id;
		this.localization = localization;
	}
	
	@Override
	public String getBankName() {
		return bankName;
	}

	@Override
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public double getTotalQuantity() {
		return totalQuantity;
	}

	@Override
	public void setTotalQuantity(double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getLocalization() {
		return localization;
	}

	@Override
	public void setLocalization(String localization) {
		this.localization = localization;
	}

	@Override
	public String toString() {
		return "BankAccountImplemented [bankName=" + bankName + ", userName=" + userName + ", totalQuantity="
				+ totalQuantity + ", id=" + id + ", localization=" + localization + "]";
	}


}
