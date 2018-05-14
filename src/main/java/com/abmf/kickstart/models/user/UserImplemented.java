package main.java.com.abmf.kickstart.models.user;

import java.util.ArrayList;
import java.util.List;

import main.java.com.abmf.kickstart.models.bankaccount.BankAccount;
import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.project.Project;

public class UserImplemented extends User {
	
	private double donationValue;
	
	public UserImplemented() {
		name = "";
		email = "";
		password = "";
		bankAccount = null;
		biography = "";
		country = "";
		projects = new ArrayList<>();
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
	
	public void addProject(Project project) {
		projects.add(project);
	}
	
	public void removeProjectByTitle(String title) {
		for(Project project : projects) 
			if(project.getTitle().equals(title)) {
				projects.remove(project);
				return;
			}
	}
	
	public List<Project> getAllProjects() {
		return projects;
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
	public String getSupporterName() {
		return this.getName();
	}

	@Override
	public void setDonationValue(double donationValue) {
		this.donationValue = donationValue;
	}
	
	@Override
	public double getDonationValue() {
		return donationValue;
	}

	@Override
	public CreditCard getCreditCard() {
		return creditCard;
	}

	@Override
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "UserImplemented [donationValue=" + donationValue + ", name=" + name + ", email=" + email + ", password="
				+ password + ", bankAccount=" + bankAccount + ", biography=" + biography + ", country=" + country
				+ ", creditCard=" + creditCard + "]";
	}
	
}
