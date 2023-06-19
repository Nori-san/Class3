package Activity3;

import java.util.Scanner;

public class Act3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Write a program to find all roots of a quadratic equation
		
		double a, b, c, discriminant, root1, root2, root, real, imaginary;
		System.out.println("Quadratic Equation - ax^2 + bx + c = 0");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a = input.nextDouble();
		System.out.print("Enter value of b: ");
		b = input.nextDouble();
		System.out.print("Enter value of c: ");
		c = input.nextDouble();
		
		discriminant = b * b - 4 * a * c;
		
		
		if(discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Root1: " + root1);
			System.out.println("Root2: " + root2);
		} else if (discriminant == 0) {
			root = -b / (2 * a);
			System.out.println("Root: " + root);
		} else {
			real = -b / (2 / a);
			imaginary = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("Root1 " + real + " + " + imaginary + "i");
			System.out.println("Root2 " + real + " - " + imaginary + "i");
		}
			input.close();
		

	}

}
