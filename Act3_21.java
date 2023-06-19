package Activity3;

import java.util.Scanner;

public class Act3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 The marks obtained by a student in 5 different subjects are input through the keyboard. The 
//		 student gets a division as per the following rules: Write a program to calculate the division 
//		 obtained by the student
//		  Percentage above or equal to 60 - First division
//		  Percentage between 50 and 59 - Second division
//		  Percentage between 40 and 49 - Third division
//		  Percentage less than 40 – Fail
		
		int math, physics, chemistry, arts, physed, avgGrade;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Math Grade: ");
		math = input.nextInt();
		System.out.print("Enter physics Grade: ");
		physics = input.nextInt();
		System.out.print("Enter chemistry Grade: ");
		chemistry = input.nextInt();
		System.out.print("Enter arts Grade: ");
		arts = input.nextInt();
		System.out.print("Enter physed Grade: ");
		physed = input.nextInt();
		
		avgGrade = (math + physics + chemistry + arts + physed) / 5;
		
		if (avgGrade >= 60) {
			System.out.println("You are in the first division");
		} else if (avgGrade < 60 && avgGrade >= 50) {
			System.out.println("You are in the second division");
		} else if (avgGrade < 50 && avgGrade >= 40){
			System.out.println("You are in the third division");
		} else {
			System.out.println("You failed!");
		}
		input.close();
	}

}
