package main.java.com.abmf.kickstart.models.creditcard;

public class CreditCardImplemented  extends CreditCard{

	
	
	public static class Builder {
		private String cardNumber;
		private String cardHolder;
		private String expirationDate;
		private String securityCode;
		
		public Builder() {
			
		}
		
		public Builder withCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}
		
		public Builder withCardHolder(String cardHolder) {
			this.cardHolder = cardHolder;
			return this;
		}
		
		public Builder withExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}
		
		public Builder withSecurityCode(String securityCode) {
			this.securityCode = securityCode;
			return this;
		}
		
		public CreditCardImplemented build() {
			return new CreditCardImplemented(this);
		}

		public String getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getCardHolder() {
			return cardHolder;
		}

		public void setCardHolder(String cardHolder) {
			this.cardHolder = cardHolder;
		}

		public String getExpirationDate() {
			return expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getSecurityCode() {
			return securityCode;
		}

		public void setSecurityCode(String securityCode) {
			this.securityCode = securityCode;
		}
		
	}
	
	public CreditCardImplemented() {
		cardNumber = "";
		cardHolder = "";
		expirationDate = "";
		securityCode = "";
	}
		
	public CreditCardImplemented(String cardNumber, String cardHolder, String expirationDate, String securityCode) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
	}

	public CreditCardImplemented(Builder builder) {
		this.cardNumber = builder.getCardNumber();
		this.cardHolder = builder.getCardHolder();
		this.expirationDate = builder.getExpirationDate();
		this.securityCode = builder.getExpirationDate();
	}
	
	@Override
	public String getCardNumber() {
		return cardNumber;
	}
	
	@Override
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String getCardHolder() {
		return cardHolder;
	}

	@Override
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	@Override
	public String getExpirationDate() {
		return expirationDate;
	}

	@Override
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String getSecurityCode() {
		return securityCode;
	}

	@Override
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolder=" + cardHolder + ", expirationDate="
				+ expirationDate + ", securityCode=" + securityCode + "]";
	}
	
}
