package main.java.com.abmf.kickstart.models.comment;

import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserNull;

public class CommentNull extends Comment {

	public CommentNull() {
		text = "";
		user = new UserNull();
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {}

	@Override
	public String toString() {
		return "CommentNull [text=" + text + ", user=" + user + "]";
	}	

}
