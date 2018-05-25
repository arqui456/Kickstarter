package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.abmf.kickstart.models.comment.Comment;
import main.java.com.abmf.kickstart.models.comment.CommentImplemented;
import main.java.com.abmf.kickstart.models.comment.CommentNull;
import main.java.com.abmf.kickstart.models.creditcard.CreditCardImplemented;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserImplemented;
import main.java.com.abmf.kickstart.models.user.UserNull;
import main.java.com.abmf.kickstart.services.AuthService;
import main.java.com.abmf.kickstart.services.ProjectsDiscoverService;
import main.java.com.abmf.kickstart.services.ServiceFactory;
import main.java.com.abmf.kickstart.services.SessionService;
import main.java.com.abmf.kickstart.view.KickStarterDeployer;

public class UnitTests {

	@Test
	public void shouldCreateCreditCard() {
		CreditCardImplemented card = new CreditCardImplemented.Builder().withCardNumber("0001111322022")
											      .withCardHolder("Aurelio B Miranda")
												  .withExpirationDate("21/21")
												  .withSecurityCode("505")
												  .build();
		
		assert(card != null);
	}

	@Test
	public void shouldCreateDiscoverServiceInstance() {
		ProjectsDiscoverService discoverService = (ProjectsDiscoverService) ServiceFactory.getInstance()
																	.getService(new ProjectsDiscoverService());
		assert(discoverService != null);
	}
	
	@Test
	public void shouldCreateSessionServiceInstance() {
		SessionService sessionService = (SessionService) ServiceFactory.getInstance()
																	.getService(new SessionService());
		assert(sessionService != null);
	}
	
	@Test
	public void shouldCreateAuthServiceInstance() {
		AuthService authService = (AuthService) ServiceFactory.getInstance()
															.getService(new AuthService());
		assert(authService != null);
	}
	
	@Test
	public void shouldCreateKickStarterApp() {
		KickStarterDeployer instance = KickStarterDeployer.getInstance();
		assert(instance != null);
	}

	
	@Test
	public void userInstantionShouldWork() {
		User user = new UserImplemented("Aurelio", "abmf", "123", null, "va", "vaca");
		assert(user != null);
		User nullUser = new UserNull();
		assert(user != null);
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
