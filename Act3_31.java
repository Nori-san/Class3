package Activity3;


import java.util.Scanner;

public class Act3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program that accepts three numbers and check All numbers are equal or not

		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		System.out.print("Enter the third number: ");
		num3 = input.nextInt();

		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("All numbers are equal");
		} else {
			System.out.println("Not all numbers are equal");
		}
		input.close();

	}

}
