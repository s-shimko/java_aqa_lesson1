package by.htp.lesson1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numer 0-9:");
		int num = in.nextInt();

		if (num % 2 == 0 && num < 10 && num >= 0) {
			System.out.println("Even");
		} else if (num % 2 != 0 && num < 10 && num > 0) {
			System.out.println("Odd");
		} else {
			System.out.println("Wrong");
		}
	}
}


