package main.java.com.abmf.kickstart.models.project;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum Category {
	ART(1),
	COMMICS(2),
	CRAFTS(3),
	DANCE(4),
	DESIGN(5),
	FASHION(6),
	FILM_AND_VIDEO(7),
	FOOD(8),
	GAMES(9),
	JOURNALISM(10),
	MUSIC(11),
	PHOTOGRAPHY(12),
	PUBLISHING(13),
	TECHNOLOGY(14),
	THEATER(15),
	UNDEFINED(16);
	
	private int category;
	
	Category(int categortyInput){
		category = categortyInput;
	}
	
	int getCategory() {
		return category;
	}
	
	void setCategory(int category) {
		this.category = category;
	}
	
	public void viewCategories() {
		List<Category> list = new ArrayList<Category>(EnumSet.allOf(Category.class));
		for (int i = 0; i < list.size(); i++){
		    System.out.printf("[%d] " + list.get(i).name(), i + 1);
		}
	}
	
}
