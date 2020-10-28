package maxtrain.gregdoud;

import java.util.Scanner;

public class Console {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getInt(String prompt) {
		System.out.print(prompt);
		return Integer.valueOf(sc.nextLine()); 
	}
	public static String getString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine(); 
	}
	

}
