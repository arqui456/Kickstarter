package main.java.com.abmf.kickstart.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KickStarter {

	private Map<String, User> users;
	private Map<String, Project> projects;
	
	public KickStarter() {
		users = new HashMap<>();
		projects = new HashMap<>();
	}
	
	public void addUser(User user) {
		users.put(user.getEmail(), user);
	}
	
	public void removeUser(User user) {
		users.remove(user.getEmail());
	}
	
	public void editUser(User user) {
		users.remove(user.getEmail());
		users.put(user.getEmail(), user);
	}
	
	public List<User> getUsers() {
		return new ArrayList<User>(users.values());
	}
	
	public void addProject(Project project) {
		projects.put(project.getTitle(), project);
	}
	
	public void removeProject(Project project) {
		projects.remove(project.getTitle());
	}
	
	public void editProject(Project project) {
		projects.remove(project).getTitle();
		projects.put(project.getTitle(), project);
	}
	
	public List<Project> getProjects() {
		return new ArrayList<Project>(projects.values());
	}
	
}
