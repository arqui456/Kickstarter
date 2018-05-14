package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.abmf.kickstart.models.comment.Comment;
import main.java.com.abmf.kickstart.models.comment.CommentImplemented;
import main.java.com.abmf.kickstart.models.comment.CommentNull;
import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserImplemented;
import main.java.com.abmf.kickstart.models.user.UserNull;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class UserTest {

	@Test
	public void userInstantionShouldWork() {
		User user = new UserImplemented("Aurelio", "abmf", "123", null, "va", "vaca");
		assert(user != null);
		User nullUser = new UserNull();
		assert(user != null);
	}
	
	@Test
	public void shouldCreateCreditCard() {
		CreditCard card = new CreditCard.Builder().withCardNumber("0001111322022")
											      .withCardHolder("Aurelio B Miranda")
												  .withExpirationDate("21/21")
												  .withSecurityCode("505")
												  .build();
		
		assert(card != null);
	}

	@Test
	public void shouldCreateKickStarterApp() {
		KickStarterDeployer instance = KickStarterDeployer.getInstance();
		assert(instance != null);
	}
	
	@Test
	public void shouldCreateCommnetsUsing() {
		Comment commnet = new CommentNull();
		assert(commnet != null);
		commnet = new CommentImplemented("tame", new UserNull());
		assert(commnet != null);
		commnet = new CommentImplemented("tame", new UserImplemented());
		assert(commnet != null);
	}
	
}
