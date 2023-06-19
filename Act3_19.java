package Activity3;

import java.util.Scanner;

public class Act3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		The current year and the year in which the employee joined the organization are entered 
//		through the keyboard. If the number of years for which the employee has served the 
//		organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of 
//		service are not greater than 3, then the program should do nothing

		int currentYear, employedYear, service;
		Scanner input = new Scanner(System.in);
		System.out.print("Current Year: ");
		currentYear = input.nextInt();
		System.out.print("Year Employed: ");
		employedYear = input.nextInt();
		
		service = currentYear - employedYear;
		
		if (service > 3) {
			System.out.println("You recieve 2500 bonus");
		} else { 
			System.out.println("Year of service insufficient for bonus");
		}
	
		input.close();
	}

	}


