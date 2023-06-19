package Activity3;

import java.util.Scanner;

public class Act3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		while purchasing certain items, a discount of 10% is offered if the quantity purchased is 
//		more than 100. If quantity and price per item are input through the keyboard, write a program 
//		to calculate the total expenses

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quantity: ");
		int qty = input.nextInt();
		System.out.print("Enter price per item: ");
		double price = input.nextDouble();
		double total = qty * price;
		
		if (qty > 100) {
			double discount = total * 0.1;
			total = total - discount;
			System.out.println("The total expenses is: " + total);
		} else { 
			System.out.println("The total expenses is: " + total);
		}
	
		input.close();
		
	}

}
