package main.java.com.abmf.kickstart.services;

import java.util.Scanner;

import main.java.com.abmf.kickstart.models.User;

public class SessionService {

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
				case 9:
					shouldStayLogged = false;
					break;
				default:
					break;
			}
			
		}
	}
}
