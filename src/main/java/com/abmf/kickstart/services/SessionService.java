package main.java.com.abmf.kickstart.services;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class SessionService implements Service {

	private User user;
	private Scanner scanner;
	
	public void enterInLoggedSession(User user) {
		this.user = user;
		scanner = new Scanner(System.in);
		runSessionUI();
		//scanner.close();
	}
	
	private void runSessionUI() {
		boolean shouldStayLogged = true;
		while(shouldStayLogged) {
			System.out.println(String.format("Hello, %s", user.getName()));
			System.out.println("1. Edit profile");
			System.out.println("2. See profile state");
			System.out.println("3. Erase account");
			System.out.println("4. My Projects");
			System.out.println("5. See projects");
			System.out.println("9. Log out");
			System.out.println(">>> ");
			
			int input = -1;
			try {
				input = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				input = -1;
			}
			
			switch(input) {
				case 1:
					editProfile();
					break;
				case 2:
					seeProfileState();
					break;
				case 3:
					if(eraseAccount())
						shouldStayLogged = false;
					break;
				case 9:
					shouldStayLogged = false;
					break;
				default:
					break;
			}
			
		}
	}
	
	private boolean eraseAccount() {
		boolean isAccountFinished = false;
		System.out.print("Are you sure you want to finish your account (s/n)? ");
		String response = scanner.nextLine();
		while(response.equals("") || !((response.equals("s")) || response.equals("n"))) {
			System.out.print("Invalid input, type it again: ");
			response = scanner.nextLine();
		}
		if(response.equals("s")) {
			KickStarterDeployer.kickStarterInstance.removeUser(user);	
			isAccountFinished = true;
		} 
		return isAccountFinished;
	}
	
	private void editProfile() {
		boolean stayEditing = true;
		while(stayEditing) {
			System.out.println("1. Edit name");
			System.out.println("2. Edit password");
			System.out.println("3. Edit biography");
			System.out.println("4. Change contry");
			System.out.println("5. Credit card");
			System.out.println("6. Save changes");
			
			switch(Integer.parseInt(scanner.nextLine())) {
				case 1:	
					System.out.print("Type new name: ");
					user.setName(scanner.nextLine());
					break;
				case 2:
					System.out.print("Type new password: ");
					user.setPassword(scanner.nextLine());
					break;
				case 3:
					System.out.print("Type profile biography: ");
					user.setBiography(scanner.nextLine());
					break;
				case 4:
					System.out.print("Type country: ");
					user.setCountry(scanner.nextLine());
					break;
				case 5:
					seeCreditCardHandler();
					break;
				case 6:
					stayEditing = false;
					break;
			}
		}
		
	}
	
	private void seeCreditCardHandler() {
		boolean isEditing = true;
		while(isEditing) {
			System.out.println("1. See credit card");
			System.out.println("2. Add credit card");
			System.out.println("3. Save changes");
			
			int input = -1;
			try {
				input = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				input = -1;
			}
			
			switch(input) {
				case 1: 
					System.out.println(getCreditCardState(user.getCreditCard()));
					break;
				case 2:
					addCreditCardHandler();
					break;
				case 3:
					isEditing = false;
					break;		
			}
		}
	}
	
	private void seeProfileState() {
		System.out.println(getUserDescription(user));
	}
	
	private String getUserDescription(User user) {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("Name: %s", user.getName()));
		builder.append(String.format("\nEmail: %s", user.getEmail()));
		builder.append(String.format("\nPassword: %s", user.getPassword()));
		builder.append(String.format("\nBiography: %s", user.getBiography()));
		builder.append(String.format("\nCountry: %s", user.getCountry()));
		return builder.toString();
		
	}
	
	private void addCreditCardHandler() {
		if(user.getCreditCard() == null) {
			boolean isGettingCardData = true;
			while(isGettingCardData) {
				System.out.print("Type card holder: ");
				String name = scanner.nextLine();
				System.out.print("Type card number: ");
				String cardNumber = scanner.nextLine();
				System.out.print("Type expiration date (mm/yy): ");
				String expirationDate = scanner.nextLine();
				System.out.print("Type secury code: ");
				String securyCode = scanner.nextLine();
				
				CreditCard card = new CreditCard.Builder()
												.withCardHolder(name)
												.withCardNumber(cardNumber)
												.withExpirationDate(expirationDate)
												.withSecurityCode(securyCode)
												.build();
				user.setCreditCard(card);
				isGettingCardData = false;
			}
		} else {
			System.out.println("User already has a credit card associated");
		}
	}
	
	private String getCreditCardState(CreditCard creditCard) {
		String toReturn = "User has no credit card associated.";
		if(creditCard != null) {
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("Card holder: %s", creditCard.getCardHolder()));
			builder.append(String.format("\nCard number: %s", creditCard.getCardNumber()));
			builder.append(String.format("\nExpiration Date: %s", creditCard.getExpirationDate()));
			builder.append(String.format("\nSecurity code: %s", creditCard.getSecurityCode()));
			toReturn = builder.toString();
		} 
		return toReturn;
	}
}
