package main.java.com.abmf.kickstart.models.bankaccount;

public class BankAccountNull extends BankAccount {

	public BankAccountNull() {
		bankName = "";
		userName = "";
		totalQuantity = 0;
		id = 0;
		localization = "";
	}
	
	@Override
	public String getBankName() {
		return bankName;
	}

	@Override
	public void setBankName(String bankName) {}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String userName) {}

	@Override
	public double getTotalQuantity() {
		return totalQuantity;
	}

	@Override
	public void setTotalQuantity(double totalQuantity) {}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {}

	@Override
	public String getLocalization() {
		return localization;
	}
	
	@Override
	public void setLocalization(String localization) {}

	@Override
	public String toString() {
		return "BankAccountNull [bankName=" + bankName + ", userName=" + userName + ", totalQuantity=" + totalQuantity
				+ ", id=" + id + ", localization=" + localization + "]";
	}
	
}
