package main.java.com.abmf.kickstart.models.creditcard;

public class CreditCardNull extends CreditCard {
	
	public CreditCardNull() {
		 cardNumber = "";
		 cardHolder= "";
		 expirationDate = "";
		 securityCode = "";
	}

	@Override
	public String getCardNumber() {
		return cardNumber;
	}

	@Override
	public void setCardNumber(String cardNumber) {}

	@Override
	public String getCardHolder() {
		return cardHolder;
	}

	@Override
	public void setCardHolder(String cardHolder) {}

	@Override
	public String getExpirationDate() {
		return expirationDate;
	}

	@Override
	public void setExpirationDate(String expirationDate) {}

	@Override
	public String getSecurityCode() {
		return securityCode;
	}

	@Override
	public void setSecurityCode(String securityCode) {}

}
