package main.java.com.abmf.kickstart.models.user;

import java.util.List;

import main.java.com.abmf.kickstart.models.bankaccount.BankAccount;
import main.java.com.abmf.kickstart.models.bankaccount.BankAccountNull;
import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.project.Project;

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

	@Override
	public String getSupporterName() {
		return "";
	}

	@Override
	public double getDonationValue() {
		return 0;
	}

	@Override
	public void setDonationValue(double donationValue) {
	}

	@Override
	public CreditCard getCreditCard() {
		return null;
	}

	@Override
	public void setCreditCard(CreditCard creditCard) {		
	}

	@Override
	public List<Project> getAllProjects() {
		return null;
	}

	@Override
	public void addProject(Project project) {
		
	}

	@Override
	public void removeProjectByTitle(String title) {
		
	}

}
