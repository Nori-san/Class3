package Activity3;

import java.util.Scanner;

public class Act3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.

		 Scanner input = new Scanner(System.in);
		 
		 	double side1, side2, side3;
	        System.out.print("Enter the length of side 1: ");
	        side1 = input.nextDouble();

	        System.out.print("Enter the length of side 2: ");
	        side2 = input.nextDouble();

	        System.out.print("Enter the length of side 3: ");
	        side3 = input.nextDouble();

	        if (side1 == side2 && side2 == side3) {
	            System.out.println("The triangle is an equilateral triangle.");
	        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	            System.out.println("The triangle is an isosceles triangle.");
	        } else {
	            System.out.println("The triangle is a scalene triangle.");
	        }
	        
	        input.close();
	}

}
