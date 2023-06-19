package Activity3;

import java.util.Scanner;

public class Act3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to input all sides of a triangle and check whether triangle is valid or not.

		int side1, side2, side3, side;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side 1: ");
		side1 = input.nextInt();
		System.out.print("Enter the length of side 2: ");
		side2 = input.nextInt();
		System.out.print("Enter the length of side 3: ");
		side3 = input.nextInt();

		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			System.out.println("Triangle is valid");
		} else {
			System.out.println("Triangle is not valid");
		}

		input.close();

	}

}
