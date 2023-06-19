package Activity3;

import java.util.Scanner;

public class Act3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to 
//		determine the youngest of the three

		int ageRam, ageShyam, ageAjay, youngestAge;
		Scanner input = new Scanner(System.in);
		System.out.print("Ram's age: ");
		ageRam = input.nextInt();
		System.out.print("Shyam's age: ");
		ageShyam = input.nextInt();
		System.out.print("Ajay's age: ");
		ageAjay = input.nextInt();
		
		youngestAge = (Math.min(Math.min(ageRam, ageShyam) , Math.min(ageShyam, ageAjay)));
		
		if (ageRam == youngestAge) {
			System.out.print("Ram is the youngest");
		} else if (ageShyam == youngestAge) {
			System.out.print("Shyam is the youngest");
		} else {
			System.out.print("Ajay is the youngest");
		}
		
		input.close();
		
	}

}
