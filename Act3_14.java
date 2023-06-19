package Activity3;

import java.util.Scanner;

public class Act3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Write a program to calculate profit or loss
		
		double cost, sell, profitOrLoss;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cost price: ");
		cost = input.nextDouble();
		System.out.print("Enter selling price: ");
		sell = input.nextDouble();
		
		profitOrLoss = sell - cost;
		
		if(profitOrLoss > 0) {
			System.out.println("Your making " + profitOrLoss + "$ profits.");
		} else if (profitOrLoss < 0) {
			System.out.println("Your losing " + profitOrLoss + "$.");
		} else {
			System.out.println("Stagnant no profit or loss");
		}
		input.close();
	}

}
