package main.java.com.abmf.kickstart.models.user;

import java.util.ArrayList;
import java.util.List;

import main.java.com.abmf.kickstart.models.bankaccount.BankAccount;
import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.project.Project;

public abstract class User implements Supporter {
	
	protected String name;
	protected String email;
	protected String password;
	protected BankAccount bankAccount;
	protected String biography;
	protected String country;
	protected CreditCard creditCard;
	protected List<Project> projects = new ArrayList<>();
	
	public abstract CreditCard getCreditCard();

	public abstract void setCreditCard(CreditCard creditCard);

	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract String getEmail();
	
	public abstract void setEmail(String email);
	
	public abstract String getPassword();
	
	public abstract void setPassword(String password);
	
	public abstract BankAccount getBankAccount();
	
	public abstract void setBankAccount(BankAccount bankAccount);
	
	public abstract String getBiography();
	
	public abstract void setBiography(String biography);
	
	public abstract String getCountry();
	
	public abstract void setCountry(String country);
	
	public abstract List<Project> getAllProjects();
	
	public abstract void addProject(Project project);
	
	public abstract void removeProjectByTitle(String title);
	
}
