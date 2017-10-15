package by.htp.lesson1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numer 0-9:");
		int num = in.nextInt();

		String result = "";
		switch (num) {
		case 0:
			result = "Zero";
			break;
		case 1:
			result = "One";
			break;
		case 2:
			result = "Two";
			break;
		case 3:
			result = "Three";
			break;
		case 4:
			result = "Four";
			break;
		case 5:
			result = "Five";
			break;
		case 6:
			result = "Six";
			break;
		case 7:
			result = "Seven";
			break;
		case 8:
			result = "Eight";
			break;
		case 9:
			result = "Nine";
			break;
		default:
			result = "Wrong!";
		}

		System.out.println(result);
	}

}
