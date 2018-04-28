package main.java.com.abmf.kickstart.view;

import java.security.Provider.Service;
import java.util.Scanner;

import main.java.com.abmf.kickstart.models.kickstarter.KickStarter;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserImplemented;
import main.java.com.abmf.kickstart.services.AuthService;
import main.java.com.abmf.kickstart.services.ServiceFactory;
import main.java.com.abmf.kickstart.services.ServiceType;
import main.java.com.abmf.kickstart.services.SessionService;
import main.java.com.abmf.kickstart.utils.InputReader;

public class KickStarterDeployer {
	
	private static KickStarterDeployer INSTANCE = null;
	
	public static KickStarter kickStarterInstance;
	private Scanner scanner;
	private AuthService authService;
	private SessionService sessionService;
	
	private KickStarterDeployer() {
		scanner = new Scanner(System.in);
		kickStarterInstance = new KickStarter();
		authService = (AuthService) ServiceFactory.getInstance()
				.getService(ServiceType.AUTH);
		
		sessionService = (SessionService) ServiceFactory.getInstance()
				.getService(ServiceType.SESSION);
	}
	
	public static KickStarterDeployer getInstance() {
		if(INSTANCE == null)
			INSTANCE = new KickStarterDeployer();
		return INSTANCE;
	}
	
	public void run() {
		boolean shouldRun = true;
		while(shouldRun) {
			System.out.println("1. Sign In");
			System.out.println("2. Sign Up");
			System.out.println("3. Get out");
			System.out.println(">>> ");
					
			int input = -1;
			String entry = scanner.nextLine();
			try {
				input = Integer.parseInt(entry);
			} catch(Exception e) {
				input = -1;
			}
			
			switch(input) {
				case 1:
					signIn();
					break;
				case 2:
					signUp();
					break;
				case 3:
					shouldRun = false;
					break;
				default:
					break;
			}
		}
		scanner.close();
	}
	
	private void signIn() {
		System.out.print("Type your login: ");
		String login = scanner.nextLine();
		System.out.print("Type password: ");
		String password = scanner.nextLine();
		if(!login.equals("") && !password.equals("")) {
			User user = authService.isThereAUser(login, password);
			if(user != null)
				sessionService.enterInLoggedSession(user);
			else if(!authService.isLoginAlreadyUsed(login))
				System.out.println("User not found");
			else 
				System.out.println("Invalid login params.");
		}
	}
	
	private void signUp() {
		System.out.print("Type your login: ");
		String login = scanner.nextLine();
		if(!authService.isLoginAlreadyUsed(login)) {
			System.out.print("Type password: ");
			String password = scanner.nextLine();
			System.out.print("Type your name: ");
			String name = scanner.nextLine();
			User user = new UserImplemented(name, login, password);
			kickStarterInstance.addUser(user);
			System.out.println(String.format("Welcome, %s!", user.getName()));
			sessionService.enterInLoggedSession(user);
		} else {
			System.out.println("Login already in use.");
		}
	}
	
}
