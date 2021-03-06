package main.java.com.abmf.kickstart.models.project;

import java.util.ArrayList;
import java.util.List;

import main.java.com.abmf.kickstart.models.comment.Comment;
import main.java.com.abmf.kickstart.models.user.Supporter;

public class Project {

	private String title;
	private Category category;
	private String description;
	private String projectOwner;
	private long duration;	
	private double desiredMoney;
	private List<Comment> comments;
	private List<Supporter> contribuitors;
	private double currentMoney;
	
	public Project() {
		title = "";
		category = Category.UNDEFINED;
		projectOwner = "";
		duration = 0;
		desiredMoney = 0;
		currentMoney = 0;
		comments = new ArrayList<>();
		contribuitors = new ArrayList<>();
	}
	
	public Project(String title, long duration, double desiredMoney, String description) {
		this();
		this.title = title;
		this.duration = duration;
		this.desiredMoney = desiredMoney;
		this.description = description;
	}
	
	public Project(String title, Category category,
			   long duration, double desiredMoney, String description) {
		this(title, duration, desiredMoney, description);
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category.setCategory(category);;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getDesiredMoney() {
		return desiredMoney;
	}

	public void setDesiredMoney(double desiredMoney) {
		this.desiredMoney = desiredMoney;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment commnet) {
		this.comments.add(commnet);
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Supporter> getContribuitors() {
		return contribuitors;
	}

	public void addSupporter(Supporter suporter) {
		this.contribuitors.add(suporter);
	}
	
	public void setContribuitors(List<Supporter> contribuitors) {
		this.contribuitors = contribuitors;
	}

	public double getCurrentMoney() {
		return currentMoney;
	}

	public void setCurrentMoney(double currentMoney) {
		this.currentMoney = currentMoney;
	}

	@Override
	public String toString() {
		return "Project [title=" + title + ", category=" + category + ", description=" + description + ", projectOwner="
				+ projectOwner + ", duration=" + duration + ", desiredMoney=" + desiredMoney + ", comments=" + comments
				+ ", contribuitors=" + contribuitors + ", currentMoney=" + currentMoney + "]";
	}
	
}
