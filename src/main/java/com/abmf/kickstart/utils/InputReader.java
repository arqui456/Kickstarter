package main.java.com.abmf.kickstart.utils;

import java.util.Scanner;

public class InputReader {
	
	public InputReader() {
	}
	
	public int getIntFromInput(String input) {
		try {
			return Integer.parseInt(input);
		} catch(NumberFormatException e) {
			return -1;
		}
	}
}
