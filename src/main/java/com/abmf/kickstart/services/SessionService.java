package main.java.com.abmf.kickstart.services;

import java.util.Scanner;

import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.project.Category;
import main.java.com.abmf.kickstart.models.project.Project;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class SessionService implements Service {

	private User user;
	private Scanner scanner;
	private ProjectsDiscoverService discoverService;
	
	public void enterInLoggedSession(User user) {
		this.user = user;
		scanner = new Scanner(System.in);
		discoverService = (ProjectsDiscoverService) ServiceFactory.getInstance()
						.getService(ServiceType.PROJECT_DISCOVER);
		runSessionUI();
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
				case 4:
					myProjectsHandler();
					break;
				case 5:
					projectsHandler();
					break;
				case 9:
					shouldStayLogged = false;
					break;
				default:
					break;
			}
			
		}
	}
	
	private void projectsHandler() {
		boolean isOnProjects = true;
		while(isOnProjects) {
			System.out.println("Type one option:");
			System.out.println("1. See all projects");
			System.out.println("2. Get back");
			
			int input = -1;
			try {
				input = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				input = -1;
			}
			
			switch(input) {
				case 1:
					showAllProjectsHandler();
					break;
				case 2:
					isOnProjects = false;
					break;
			}
		}
	}
	
	private void showAllProjectsHandler() {
		if(discoverService.getAllProjects().size() > 0) {
			System.out.println("Type project id to see more: ");
			int id = 0;
			for(Project project : discoverService.getAllProjects())
				System.out.println(projectStringModal(project, id++));
			
			System.out.print(">>>");
			int input = -1;
			try {
				input = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				input = -1;
			}
			
		} else {
			System.out.println("There are no projects publishied yet.");
			System.out.println("Press any key to get back");
			scanner.nextLine();
		}
		
	}
	
	private String projectStringModal(Project project, int id) {
		StringBuilder builder = new StringBuilder();
		return builder.toString();
	}
	
	private void myProjectsHandler() {
		boolean isSeeingMyProjects = true;
		while(isSeeingMyProjects) {
			System.out.println("Type one option: ");
			System.out.println("1. See my projects");
			System.out.println("2. New project");
			System.out.println("3. Back");
			System.out.println(">>>");
			
			int input = -1;
			try {
				input = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				input = -1;
			}
			
			switch(input) {
				case 1:
					seeMyProjects();
					break;
				case 2:
					newProject();
					break;
				case 3: 
					isSeeingMyProjects = false;
					break;
			}
		}
	}
	
	private void newProject() {
		boolean isAddingProject = true;
		while(isAddingProject) {
			System.out.print("Type project name: ");
			String name = scanner.nextLine();
			System.out.print("Add a description: ");
			String description = scanner.nextLine();
			System.out.print("Type desired money: ");
			double desiredMoney = Double.parseDouble(scanner.nextLine());
			System.out.print("Type duration: ");
			long duration = Long.parseLong(scanner.nextLine());
			Project project = new Project(name, duration, desiredMoney, description);
			System.out.println("Type the category: ");
			System.out.println("1. ART");
			System.out.println("2. COMMICS");
			System.out.println("3. CRAFTS");
			System.out.println("4. DANCE");
			System.out.println("5. DESIGN");
			System.out.println("6. FASHION");
			System.out.println("7. FILM_AND_VIDEO");
			System.out.println("8. FOOD");
			System.out.println("9. GAMES");
			System.out.println("10. JOURNALISM");
			System.out.println("11. MUSIC");
			System.out.println("12. PHOTOGRAPHY");
			System.out.println("13. PUBLISHING");
			System.out.println("14. TECHNOLOGY");
			System.out.println("15. THEATER");
			System.out.println("16. UNDEFINED");
			System.out.print(">>>");
			
			int option = -1;
			try {
				option = Integer.parseInt(scanner.nextLine());
			} catch(Exception e) {
				System.out.println("PROCLEM");
				option = -1;
			}
			
			switch(option) {
				case 1:
					project.setCategory(Category.ART);
					break;
				case 2:
					project.setCategory(Category.COMMICS);
					break;
				case 3:
					project.setCategory(Category.CRAFTS);
					break;
				case 4:
					project.setCategory(Category.DANCE);
					break;
				case 5:
					project.setCategory(Category.DESIGN);
					break;
				case 6:
					project.setCategory(Category.FASHION);
					break;
				case 7:
					project.setCategory(Category.FILM_AND_VIDEO);
					break;
				case 8:
					project.setCategory(Category.FOOD);
					break;
				case 9:
					project.setCategory(Category.GAMES);
					break;
				case 10:
					project.setCategory(Category.JOURNALISM);
					break;
				case 11:
					project.setCategory(Category.MUSIC);
					break;
				case 12:
					project.setCategory(Category.PHOTOGRAPHY);
					break;
				case 13:
					project.setCategory(Category.PUBLISHING);
					break;
				case 14:
					project.setCategory(Category.TECHNOLOGY);
					break;
				case 15:
					project.setCategory(Category.THEATER);
					break;
				default:
					project.setCategory(Category.UNDEFINED);
					break;
			}
			
			project.setProjectOwner(user.getEmail());
			user.addProject(project);
			KickStarterDeployer.kickStarterInstance.addProject(project);
			isAddingProject = false;
		}
		
	}
	
	private void seeMyProjects() {
		if(!user.getAllProjects().isEmpty()) {
			for(Project project : user.getAllProjects()) 
				System.out.println(getProjectDescription(project));

			System.out.println("------------------------------------");
			System.out.println("Press any key to get back");
			scanner.nextLine();
		} else {
			System.out.println("User has no projects");
			System.out.println("Press any key to get back");
			scanner.nextLine();
		}
	}

	public String getProjectDescription(Project project) {
		StringBuilder state = new StringBuilder();
		state.append(String.format("Title: %s", project.getTitle()));
		state.append(String.format("\nDescription: %s", project.getDescription()));
		state.append(String.format("\nDesired Money: %f", project.getDesiredMoney()));
		state.append(String.format("\nCurrent money: %f", project.getCurrentMoney()));
		return state.toString();
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
