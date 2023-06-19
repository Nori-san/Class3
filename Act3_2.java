package Activity3;

import java.util.Scanner;

public class Act3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take four numbers from the user and print the greatest number

		Scanner input = new Scanner(System.in);
		int num1, num2, num3, num4, max;
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		System.out.print("Enter thrid number: ");
		num3 = input.nextInt();
		System.out.print("Enter fourth number: ");
		num4 = input.nextInt();

		max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
		System.out.print("The biggest number is: " + max);

		input.close();
	}

}
