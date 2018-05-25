package main.java.com.abmf.kickstart.models.creditcard;

public abstract class CreditCard {
	
	protected String cardNumber;
	protected String cardHolder;
	protected String expirationDate;
	protected String securityCode;
	
	public abstract String getCardNumber();
	
	public abstract void setCardNumber(String cardNumber);

	public abstract String getCardHolder();

	public abstract void setCardHolder(String cardHolder);
	
	public abstract String getExpirationDate();

	public abstract void setExpirationDate(String expirationDate);

	public abstract String getSecurityCode();

	public abstract void setSecurityCode(String securityCode);

}
