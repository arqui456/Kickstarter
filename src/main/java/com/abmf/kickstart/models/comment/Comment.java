package main.java.com.abmf.kickstart.models.comment;

import main.java.com.abmf.kickstart.models.user.User;

public abstract class Comment {
	
	protected String text;
	protected User user;
	
	public abstract String getText();
	
	public abstract void setText(String text);
	
	public abstract User getUser();
	
	public abstract void setUser(User user);	

}
