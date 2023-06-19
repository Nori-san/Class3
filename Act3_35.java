package Activity3;

import java.util.Scanner;

public class Act3_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to check whether the given integer is a multiple of 5

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Intenger: ");
		int num = input.nextInt();

		String mod = (num % 5 == 0) ? num + " is a multiple of 5." : num + " is not a multiple of 5.";
		System.out.print(mod);
		input.close();
	}

}
