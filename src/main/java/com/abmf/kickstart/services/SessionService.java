package main.java.com.abmf.kickstart.services;

import java.util.Scanner;

import main.java.com.abmf.kickstart.models.User;

public class SessionService {

	private User user;
	private Scanner scanner;
	
	public void enterInLoggedSession(User user) {
		this.user = user;
		scanner = new Scanner(System.in);
	}
}
