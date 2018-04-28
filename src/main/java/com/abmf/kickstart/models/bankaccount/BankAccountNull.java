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
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setBankName(String bankName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotalQuantity() {
		return 0;
	}

	@Override
	public void setTotalQuantity(double totalQuantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getId() {
		return 0;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLocalization() {
		return localization;
	}

	@Override
	public String toString() {
		return "BankAccountNull [bankName=" + bankName + ", userName=" + userName + ", totalQuantity=" + totalQuantity
				+ ", id=" + id + ", localization=" + localization + "]";
	}

	@Override
	public void setLocalization(String localization) {
		// TODO Auto-generated method stub
		
	}
	
	
}
