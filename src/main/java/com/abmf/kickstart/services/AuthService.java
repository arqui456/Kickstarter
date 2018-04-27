package main.java.com.abmf.kickstart.services;

import main.java.com.abmf.kickstart.models.User;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class AuthService {
	
	public AuthService() {
		
	}
	
	public boolean isLoginAlreadyUsed(String login) {
		for(User user : KickStarterDeployer.kickStarterInstance.getUsers())
			if(user.getEmail().equals(login))
				return true;
		return false;
	}
	
	public User isThereAUser(String login, String password) {
		for(User user: KickStarterDeployer.kickStarterInstance.getUsers())
			if(user.getEmail().equals(login) && user.getPassword().equals(password))
				return user;
		return null;
	}

}
