package Activity3;

import java.util.Scanner;

public class Act3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to test a number is positive or negative

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		if (num > 0) {
			System.out.print(num + " is positive.");
		} else if (num < 0) {
			System.out.print(num + " is negative.");
		} else {
			System.out.print("number is zero");
		}

		input.close();

	}

}
