package Activity3;

import java.util.Scanner;

public class Act3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to input angles of a triangle and check whether triangle is valid or not.

		double angle1, angle2, angle3, sumOfAngle;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st angle of the triangle: ");
		angle1 = input.nextDouble();
		System.out.print("Enter 2nd angle of the triangle: ");
		angle2 = input.nextDouble();
		System.out.print("Enter 3rd angle of the triangle: ");
		angle3 = input.nextDouble();

		sumOfAngle = angle1 + angle2 + angle3;

		String toCheck = sumOfAngle == 180 && sumOfAngle != -180 ? "valid Triangle" : "Invalid Triangle";
		System.out.println(toCheck);
		
		input.close();

	}
}
