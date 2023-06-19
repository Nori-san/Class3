package Activity3;

import java.util.Scanner;

public class Act3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to check whether a year is leap year or not.

		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = input.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year");
				}
			}
		} else {
			System.out.println(year + " is not a leap year");
		}
		
		input.close();
	}

}
