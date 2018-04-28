package main.java.com.abmf.kickstart.services;

import java.util.Scanner;

import main.java.com.abmf.kickstart.models.user.User;

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
			System.out.println("4. Erase account");
			System.out.println("5. My Projects");
			System.out.println("6. See projects");
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
				case 9:
					shouldStayLogged = false;
					break;
				default:
					break;
			}
			
		}
	}
	
	private void editProfile() {
		boolean stayEditing = true;
		while(stayEditing) {
			System.out.println("1. Edit name");
			System.out.println("2. Edit password");
			System.out.println("3. Edit biography");
			System.out.println("4. Change contry");
			System.out.println("5. Edit credit card");
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
					editCreditCardHandler();
					break;
				case 6:
					stayEditing = false;
					break;
			}
		}
		
	}
	
	private void editCreditCardHandler() {
		
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
}
