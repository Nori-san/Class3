package Activity3;

import java.util.Scanner;

public class Act3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to input month number and print month Name.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month number (1-12): ");
		int monthNum = input.nextInt();

		if (monthNum < 1 || monthNum > 12) {
			System.out.println("Invalid month number");
			return;
		}

		String month = null;
		switch (monthNum) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		}

		System.out.println("Month number " + monthNum + " which corresponds to " + month + ".");

		input.close();

	}
}
