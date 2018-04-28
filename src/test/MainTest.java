package test;

import main.java.com.abmf.kickstart.models.bankaccount.BankAccount;
import main.java.com.abmf.kickstart.models.bankaccount.BankAccountImplemented;
import main.java.com.abmf.kickstart.models.bankaccount.BankAccountNull;
import main.java.com.abmf.kickstart.models.comment.Comment;
import main.java.com.abmf.kickstart.models.comment.CommentImplemented;
import main.java.com.abmf.kickstart.models.comment.CommentNull;
import main.java.com.abmf.kickstart.models.creditcard.CreditCard;
import main.java.com.abmf.kickstart.models.reward.Reward;
import main.java.com.abmf.kickstart.models.reward.RewardImplemented;
import main.java.com.abmf.kickstart.models.reward.RewardNull;
import main.java.com.abmf.kickstart.models.user.User;
import main.java.com.abmf.kickstart.models.user.UserImplemented;
import main.java.com.abmf.kickstart.models.user.UserNull;

public class MainTest {

	public static void main(String[] args) {
		User user = new UserImplemented("Aurelio", "abmf", "123", null, "va", "vaca");
		User nullUser = new UserNull();
		System.out.println(user);
		System.out.println(nullUser);
		
		Reward reward = new RewardImplemented(9.2, "oi");
		System.out.println(reward);
		reward = new RewardNull();
		System.out.println(reward);
		
		Comment commnet = new CommentNull();
		System.out.println(commnet);
		commnet = new CommentImplemented("tame", new UserNull());
		System.out.println(commnet);
		commnet = new CommentImplemented("tame", new UserImplemented());
		System.out.println(commnet);
		
		BankAccount bank = new BankAccountNull();
		System.out.println(bank);
		bank = new BankAccountImplemented("Bradesco", "Aurelio", 505, "MIMACHER");
		System.out.println(bank);
		
		CreditCard card = new CreditCard.Builder().withCardNumber("0001111322022")
												  .withCardHolder("Aurelio B Miranda")
												  .withExpirationDate("21/21")
												  .withSecurityCode("505")
												  .build();
	}
}
