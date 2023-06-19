package Activity3;

import java.util.Scanner;

public class Act3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to count total number of notes in given amount
		
		int amount, count100, count50, count20, count10, count5, count2, count1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		amount = input.nextInt();
		
		count100 = amount / 100;
		amount %= 100;
		count50 = amount / 50;
		amount %= 50;
		count20 = amount / 20;
		amount %= 20;
		count10 = amount / 10;
		amount %= 10;
		count5 = amount / 5;
		amount %= 5;
		count2 = amount / 2;
		amount %= 2;
		count1 = amount / 1;
		amount %= 1;
		
		System.out.println("Notes of 100: " + count100 + " counts");
		System.out.println("Notes of 50: " + count50 + " counts");
		System.out.println("Notes of 20: " + count20 + " counts");
		System.out.println("Notes of 10: " + count10 + " counts");
		System.out.println("Notes of 5: " + count5 + " counts");
		System.out.println("Notes of 2: " + count2 + " counts");
		System.out.println("Notes of 1: " + count1 + " counts");
		
		input.close();
		
		
		
		
	}

}
