package main.java.com.abmf.kickstart.models.reward;

public class RewardNull extends Reward {

	public RewardNull() {
		value = 0;
		description = "";
	}
	
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setValue(double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(String decription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String toString() {
		return "RewardNull [value=" + value + ", description=" + description + "]";
	}
	
	

}
