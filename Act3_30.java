package Activity3;

import java.util.Scanner;

public class Act3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		In a company, worker efficiency is determined on the basis of the time required for a worker 
//		to complete a particular job. If the time taken by the worker is between 2 – 3 hours, then the 
//		worker is said to be highly efficient. If the time required by the worker is between 3 – 4 hours, 
//		then the worker is ordered to improve speed. If the time taken is between 4 – 5 hours, the 
//		worker is given training to improve his speed, and if the time taken by the worker is more than 5 
//		hours, then the worker has to leave the company. If the time taken by the worker is input 
//		through the keyboard, find the efficiency of the worker

		Scanner input = new Scanner(System.in);
		System.out.print("Enter hours time taken: ");
		double hours = input.nextDouble();
		if (hours <= 3 && hours >= 2) {
			System.out.println("You work highly efficient");
		} else if (hours > 3 && hours < 4) {
			System.out.println("Your work needs improvement");
		} else if (hours > 4 && hours < 5) {
			System.out.println("Your need to go back to training for improvement");
		} else {
			System.out.println("You are not suitable for the company");
		}

		input.close();
	}

}
