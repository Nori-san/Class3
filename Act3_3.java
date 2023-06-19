package Activity3;

import java.util.Scanner;

public class Act3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java Program to produce an invoice for the below items
//		– Carrots: $2 / lb
//		– Onions – $4 / lb
//		– Meat – $10 / lb
//		a) Ask the customer to how many lbs do they need, and calculate the total
//		b) Ask the customer if they want to pay cash or card
//		– If Card, add 13% HST to total
//		– if Cash, don’t add Tax
//		c) Display the total amount that customer needs to pay

		double carrot, onions, meat, total;

		double carrotCost = 2, onionCost = 4, meatCost = 10;

		Scanner input = new Scanner(System.in);
		System.out.print("How much Carrots in lbs would you need? ");
		carrot = input.nextDouble();
		System.out.print("How much Onions in lbs would you need? ");
		onions = input.nextDouble();
		System.out.print("How much Meat in lbs would you need? ");
		meat = input.nextDouble();

		total = (carrot * carrotCost) + (onions * onionCost) + (meat * meatCost);

		System.out.println("Your total is: " + total + "$ tax not included");

		System.out.println("How you you like to pay? Cash or Credit? ");
		String paymentMethod = input.next();

		if (paymentMethod.equalsIgnoreCase("credit")) {
			total = total * 1.13;
			System.out.println("Your total is " + total);
		} else if (paymentMethod.equalsIgnoreCase("cash")) {
			System.out.println("Your total is " + total);
		} else {
			System.out.println("Not a valid payment method");
		}

		input.close();

	}

}
