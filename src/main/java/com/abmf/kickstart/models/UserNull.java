package main.java.com.abmf.kickstart.models;

public class UserNull extends User {
	
	public UserNull() {
		name = "";
		email = "";
		password = "";
		bankAccount = new BankAccountNull();
		biography = "";
		country = "";
	}
	
	@Override
	public String getName() {
		return "";
	}

	@Override
	public void setName(String name) {}

	@Override
	public String getEmail() {
		return "";
	}

	@Override
	public void setEmail(String email) {}

	@Override
	public String getPassword() {
		return "";
	}

	@Override
	public void setPassword(String password) {}

	@Override
	public BankAccount getBankAccount() {
		return null;
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {}

	@Override
	public String getBiography() {
		return "";
	}

	@Override
	public void setBiography(String biography) {}

	@Override
	public String getCountry() {
		return "";
	}

	@Override
	public void setCountry(String country) {}

	@Override
	public String toString() {
		return "UserImplemented [name=" + name + ", email=" + email + ", password=" + password + ", bankAccount="
				+ bankAccount + ", biography=" + biography + ", country=" + country + "]";
	}

}
