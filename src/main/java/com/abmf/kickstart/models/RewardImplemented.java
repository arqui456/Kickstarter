package main.java.com.abmf.kickstart.models;

public class RewardImplemented extends Reward {

	public RewardImplemented() {
		value = 0;
		description = "";
	}
	
	public RewardImplemented(double value, String description) {
		this.value = value;
		this.description = description;
	}
	
	@Override
	public double getValue() {
		return value;
	}

	@Override
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "RewardNull [value=" + value + ", description=" + description + "]";
	}

}
