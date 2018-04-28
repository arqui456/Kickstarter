package main.java.com.abmf.kickstart.models.comment;

import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserImplemented;

public class CommentImplemented extends Comment {

	public CommentImplemented() {
		text = "";
		user = new UserImplemented();
	}
	
	public CommentImplemented(String text, User user) {
		this.text = text;
		this.user = user;
	}
	
	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CommentImplemented [text=" + text + ", user=" + user + "]";
	}

}
