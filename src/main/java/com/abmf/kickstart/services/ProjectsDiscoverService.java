package main.java.com.abmf.kickstart.services;

import java.util.ArrayList;
import java.util.List;

import main.java.com.abmf.kickstart.models.project.Category;
import main.java.com.abmf.kickstart.models.project.Project;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class ProjectsDiscoverService implements Service {
	
	public List<Project> getAllProjects() {
		return KickStarterDeployer.kickStarterInstance.getProjects();
	}
	
	public List<Project> getProjectsByCategory(Category category) {
		List<Project> projects = new ArrayList<>();
		for(Project project : KickStarterDeployer.kickStarterInstance.getProjects())
			if(project.getCategory().equals(category))
				projects.add(project);
		return projects;
	}

}
