package Activity3;

import java.util.Scanner;

public class Act3_22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		27. Write a program to calculate the salary as per the following table
//		 Gender  	Year of Service 	Qualifications 		Salary
//		 Male 			>= 10 			Post - Graduate 	15000
//		 				>= 10 			Graduate 			10000
//		 				< 10 			Post - Graduate 	10000
//		 				< 10 			Graduate 			7000
//		 				
//		 Female 		>= 10 			Post - Graduate 	12000
//		 				>= 10 			Graduate 			9000
//		 				< 10 			Post - Graduate 	10000
//		 				< 10 			Graduate 			6000

		Scanner input = new Scanner(System.in);
		
		System.out.print("Gender (male/female): ");
		String gender = input.next();
		
		System.out.print("Years of Service: ");
		int years = input.nextInt();
		
		System.out.print("Qualifications: ");
		String qual = input.next();
		
		int salary = 0;
		
		if (gender.equalsIgnoreCase("male")) { //male salary
			if (years >= 10) {
				if (qual.equalsIgnoreCase("post-graduate")) {
					salary = 15000;
				} else if (qual.equalsIgnoreCase("graduate")) {
					salary = 10000;
				}
			} else {
				if (qual.equalsIgnoreCase("post-graduate")) {
					salary = 10000;
				} else if (qual.equalsIgnoreCase("graduate")) {
					salary = 7000;
				}
			}
		} 
		
		else if (gender.equalsIgnoreCase("female")) { //female salary
			if (years >= 10) {
				if (qual.equalsIgnoreCase("post-graduate")) {
					salary = 12000;
				} else if (qual.equalsIgnoreCase("post-graduate")) {
						salary = 9000;
				}
				} else {
					if (qual.equalsIgnoreCase("post-graduate")) {
						salary = 10000;
					} else if (qual.equalsIgnoreCase("graduate")) {
						salary = 6000;
					}
				}
			}
		
			System.out.println("Salary: " + salary);
			
			input.close();
		}		
		
	}	
		

	

