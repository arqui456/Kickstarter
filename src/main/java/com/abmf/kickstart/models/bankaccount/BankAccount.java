package main.java.com.abmf.kickstart.models.bankaccount;

public abstract class BankAccount {
	
	protected String bankName;
	protected String userName;
	protected double totalQuantity;
	protected long id;
	protected String localization;
	
	public abstract String getBankName();
	
	public abstract void setBankName(String bankName);
	
	public abstract String getUserName();
	
	public abstract void setUserName(String userName);
	
	public abstract double getTotalQuantity();
	
	public abstract void setTotalQuantity(double totalQuantity);
	
	public abstract long getId();
	
	public abstract void setId(long id);
	
	public abstract String getLocalization();
	
	public abstract void setLocalization(String localization);
		
}
