package main.java.com.abmf.kickstart.models;

public class UserImplemented extends User {

	public UserImplemented() {
		name = "";
		email = "";
		password = "";
		bankAccount = new BankAccountImplemented();
		biography = "";
		country = "";
	}
	
	public UserImplemented(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public UserImplemented(String name,String email, 
						   String password, BankAccount bankAccount, 
						   String biography, String country) {
		this(name, email, password);
		this.bankAccount = bankAccount;
		this.biography = biography;
		this.country = country;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String getBiography() {
		return biography;
	}

	@Override
	public void setBiography(String biography) {
		this.biography = biography;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserImplemented [name=" + name + ", email=" + email + ", password=" + password + ", bankAccount="
				+ bankAccount + ", biography=" + biography + ", country=" + country + "]";
	}
	

}
