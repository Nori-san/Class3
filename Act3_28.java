package Activity3;

import java.util.Scanner;

public class Act3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A certain grade of steel is graded according to the following conditions
//		i. Hardness must be greater than 50
//		ii. Carbon content must be less than 0.7
//		iii. Tensile strength must be greater than 5600
//		The grades are as follows:
//		 Grade is 10 if all three conditions are met
//		 Grade is 9 if conditions (i) and (ii) are met
//		 Grade is 8 if conditions (ii) and (iii) are met
//		 Grade is 7 if conditions (i) and (iii) are met
//		 Grade is 6 if only one condition is met
//		 Grade is 5 if none of the conditions are met
//		Write a program, which will require the user to give values of hardness, carbon content and 
//		tensile strength of the steel under consideration and output the grade of the steel
		
		int hard, tenStr;
		double carbCont;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter steel hardness value: ");
		hard = input.nextInt();
		System.out.print("Enter carbon content value: ");
		carbCont = input.nextDouble();	
		System.out.print("Enter tensile strength value: ");
		tenStr = input.nextInt();
		
		if (hard < 50 && carbCont > 0.7 && tenStr < 5600) {
			System.out.print("Steel grade 5");
		} else if (hard < 50 || carbCont > 0.7 || tenStr < 5600) {
			System.out.print("Steel grade 6");
		} else if (hard > 50 && tenStr > 5600) {
			System.out.print("Steel grade 7");
		} else if (carbCont < 0.7 && tenStr > 5600) {
			System.out.print("Steel grade 8");
		} else if (hard > 50 && carbCont < 0.7) {
			System.out.print("Steel grade 9");
		} else {
			System.out.print("Steel grade 10");
		}
		
		input.close();
	}

}
