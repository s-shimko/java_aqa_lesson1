package by.htp.lesson1;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number from -9 to 9:");
		int num = in.nextInt();

		if (num % 2 == 0 && num < 10 && num >= 0) {
			System.out.println("Even AND Positive");
		} else {
			System.out.println("Wrong");
		}
	}
}
