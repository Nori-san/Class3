package Activity3;

import java.util.Scanner;

public class Act3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Write a program to input week number and print week day.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a week number (1-7): ");
		int weekNum = input.nextInt();

		if (weekNum < 1 || weekNum > 7) {
			System.out.println("Invalid week number");
			return;
		}

		String weekday = null;
		switch (weekNum) {
		case 1:
			weekday = "monday";
			break;
		case 2:
			weekday = "tuesday";
			break;
		case 3:
			weekday = "wednesday";
			break;
		case 4:
			weekday = "thursday";
			break;
		case 5:
			weekday = "friday";
			break;
		case 6:
			weekday = "saturday";
			break;
		case 7:
			weekday = "sunday";
			break;
		}

		System.out.println("Week number " + weekNum + " corresponds to " + weekday + ".");

		input.close();

	}

}
