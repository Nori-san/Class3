package Activity3;

import java.util.Scanner;

public class Act3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to check whether a number is divisible by 5 and 11 or not

		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = input.nextInt();

		String div = (num % 5 == 0 && num % 11 == 0) ? num + " is divisible to 5 and 11"
				: num + " is not divisible to 5 and 11";
		System.out.print(div);
		input.close();
	}

}
