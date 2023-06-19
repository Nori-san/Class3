package Activity3;

import java.util.Scanner;

public class Act3_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Write a Java program that reads an positive integer and count the number of digits

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive Intenger: ");
		int num = input.nextInt();

		// verify if integer is positive
		if (num <= 0) {
			System.out.println("Invalid number, Enter a positive number");
			return;
		}

		// counting digits in the number
		int count = String.valueOf(num).length();

		System.out.println("number of digits in " + num + " is " + count);
		input.close();
	}

}
