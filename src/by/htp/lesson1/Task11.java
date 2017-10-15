 package by.htp.lesson1;

 import java.util.Scanner;
 
public class Task11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char character = ' ';
		
		while (character != 'q') {
			System.out.println("Enter any char, 'q' - quit:");
			character = in.next().charAt(0);
			System.out.println("You enter: " + character);
		}
		
		System.out.println("Program quit");
	}
	
}
