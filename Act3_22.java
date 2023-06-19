package Activity3;

import java.util.Scanner;

public class Act3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 A company insures its drivers in the following cases:
//			  If the driver is married
//			  If the driver is unmarried, male & above 30 years of age
//			  If the driver is unmarried, female & above 25 years of age
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Status: ");
		String status = input.next();
		
		System.out.print("Gender (male/female): ");
		String gender = input.next();
		
		System.out.print("Age: ");
		int age = input.nextInt();
		
		if (status.equalsIgnoreCase("married")) {
			System.out.println("Driver is eligible to be insured");
		} else if (gender.equalsIgnoreCase("male") && age > 30) {
			System.out.println("Driver is eligible to be insured");
		} else if (gender.equalsIgnoreCase("female") && age > 25) {
			System.out.println("Driver is eligible to be insured");
		} else {
			System.out.println("Driver is NOT eligible to be insured");
		}
		
		input.close();
		
	}

}
