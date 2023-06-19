package Activity3;

import java.util.Scanner;

public class Act3_34 {

	public Act3_34() {
	}

//	Method addition with 2 int parameter
	public int add(int a, int b) {
		return a + b;
	}

//	Method subtraction with 2 int parameter
	public int sub(int a, int b) {
		return a - b;
	}

//	Method multiplication with 2 int parameter
	public int mult(int a, int b) {
		return a * b;
	}

//	Method division with 2 int parameter
	public int div(int a, int b) {
		return a / b;
	}

//	Method modulo with 2 int parameter
	public int mod(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to create a simple calculator

		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		Act3_34 myCalculator = new Act3_34();

		System.out.println(myCalculator.add(num1, num2));
//		System.out.println(myCalculator.sub(num1, num2));
//		System.out.println(myCalculator.mult(num1, num2));
//		System.out.println(myCalculator.div(num1, num2));
//		System.out.println(myCalculator.mod(num1, num2));
		input.close();

	}

}
