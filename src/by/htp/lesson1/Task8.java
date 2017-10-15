package by.htp.lesson1;

//import java.time.LocalDate;
//import java.time.Month;
import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// int currentMonthNum = LocalDate.now().getMonthValue();
		// String currentMonthName = Month.of(currentMonthNum).name();

		System.out.println("Enter any Month with lowercase:");
		Scanner in = new Scanner(System.in);
		String month = in.nextLine();

		int monthNumber = 0;

		switch (month) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			System.out.println("Wrong Month Name!");
			break;
		}

		ValueRange winter = ValueRange.of(1, 2);
		ValueRange spring = ValueRange.of(3, 5);
		ValueRange summer = ValueRange.of(6, 8);
		ValueRange autumn = ValueRange.of(9, 11);

		if (autumn.isValidValue(monthNumber)) {
			System.out.println("Now is Autumn");
		} else if (spring.isValidValue(monthNumber)) {
			System.out.println("Now is Spring");
		} else if (summer.isValidValue(monthNumber)) {
			System.out.println("Now is Summer");
		} else if (monthNumber == 12 || winter.isValidValue(monthNumber)) {
			System.out.println("Now is Winter");
		}

	}

}
