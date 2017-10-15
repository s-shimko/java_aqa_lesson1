package by.htp.lesson1;

public class Task10 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;
		int great = 0;
		int less = 0;
		int res = 0;

		if (a >= b && a >= c) {
			great = a;
			if (b >= c) {
				less = c;
			} else {
				less = b;
			}
		} else if (b >= a && b >= c) {
			great = b;
			if (a >= c) {
				less = c;
			} else {
				less = a;
			}
		} else if (c >= a && c >= b) {
			great = c;
			if (b >= c) {
				less = c;
			} else {
				less = b;
			}
		}

		System.out.println("Numbers:" + a + " " + b + " " + c);
		res = less + great;
		System.out.println(great + " + " + less + " = " + res);
	}

}
