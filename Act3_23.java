package Activity3;

import java.util.Scanner;

public class Act3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A five-digit number is entered through the keyboard. Write a program to obtain the reversed 
//		number and to determine whether the original and reversed numbers are equal or not
		
		int num, revNum, digit1, digit2, digit3, digit4, digit5;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a five digit number: ");
		num = input.nextInt();
		
		if (num >= 10000 && num <=99999) {
		} else {
			System.out.println("Invalid input. Re-enter 5 digit number.");
			return;
		}
		
		digit1 = num % 10;
		digit2 = (num/10) % 10;
		digit3 = (num/100) % 10;
		digit4 = (num/1000) % 10;
		digit5 = (num/10000) % 10;
		
		revNum = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;
		
		
		
		System.out.println(revNum);
		input.close();

	}

}
