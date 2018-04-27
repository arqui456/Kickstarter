package main.java.com.abmf.kickstart.models;

public abstract class Reward {
	
	protected double value;
	protected String description;
	
	public abstract double getValue();
	
	public abstract void setValue(double value);
	
	public abstract void setDescription(String decription);
	
	public abstract String getDescription();

}
