package Activity3;

import java.util.Scanner;

public class Act3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Find the absolute value of a number entered through the keyboard
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		System.out.println(Math.abs(num));
		
		input.close();

	}

}
