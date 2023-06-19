package Activity3;

import java.util.Scanner;

public class Act3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to input electricity unit charges and calculate total electricity bill according 
//		to the given condition:
//		 For first 50 units Rs. 0.50/unit
//		 For next 150 units Rs. 0.75/unit
//		 For next 250 units Rs. 1.20/unit
//		 For unit above 250 Rs. 1.50/unit
//		 An additional surcharge of 20% is added to the bill
		
		double units, expenses, surcharges;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter electricity unit charges: ");
		units = input.nextDouble();
		
		if (units <= 50) {
			expenses = units * 0.5;
		} else if (units <= 200) { 
			expenses = (50 * 0.5) + (((units - 50) * 0.75 ));
		} else if (units <= 450) { 
			expenses = (50 * 0.5) + (150 * 0.75) + ((units -200) * 1.20);
		} else {
			expenses = (50 * 0.5) + (150 * 0.75) + (250 * 1.20) + ((units -200) * 1.20);
		}
		
		surcharges = expenses * 0.20;
		expenses += surcharges;
		
		System.out.println("Total electricity bill expense is: " + expenses);
		
		input.close(); 

	}

}
