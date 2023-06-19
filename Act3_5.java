package Activity3;

import java.util.Scanner;

public class Act3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to check whether a number is even or odd

		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = input.nextInt();

		String mod = (num % 2 == 0) ? num + " is an even number." : num + " is an odd nnumber.";
		System.out.print(mod);
		input.close();
	}

}
