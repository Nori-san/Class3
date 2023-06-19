package Activity3;

import java.util.Scanner;

public class Act3_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a java program that accepts three numbers from the user and check if numbers are in 
//		"increasing" or "decreasing" order

		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		System.out.print("Enter third number: ");
		num3 = input.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("The numbers are in increasing order");
		} else if (num1 > num2 && num2 > num3) {
			System.out.println("The numbers are in decreasing order");
		} else {
			System.out.println("The numbers have no specific order");
		}

		input.close();
	}

}
