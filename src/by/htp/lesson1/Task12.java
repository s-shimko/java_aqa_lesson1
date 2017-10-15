package by.htp.lesson1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String input = "";
		System.out.println("Enter string, 'stop' will quit:");
	        do {
	        input = in.nextLine();
	    } while (!input.contains("stop"));
		
		System.out.println("Program quit");

	}

}
