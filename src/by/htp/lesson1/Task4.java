package by.htp.lesson1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = in.nextInt();
		System.out.println("Enter b:");
		int b = in.nextInt();
		System.out.println("Enter operation: - + * /");
		char operation = in.next().charAt(0);

		if (operation == '+') {
			int result = add(a, b);
			System.out.println(result);
		} else if (operation == '-') {
			int result = subtr(a, b);
			System.out.println(result);
		} else if (operation == '*') {
			int result = mult(a, b);
			System.out.println(result);
		} else if (operation == '/') {
			int result = div(a, b);
			System.out.println(result);
		} else {
			System.out.println("Wrong operation!");
		}
	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int subtr(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int mult(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int div(int a, int b) {
		int c = a / b;
		return c;
	}

}
