package Activity3;

import java.util.Scanner;

public class Act3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Given the length and breadth of a rectangle, write a program to find whether the area of the 
//		 rectangle is greater than its perimeter. For example, the area of the rectangle with length = 5 
//		 and breadth = 4 is greater than its perimeter
		
		int length, breadth, area, perimeter;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length value: ");
		length = input.nextInt();
		System.out.print("Enter breadth value: ");
		breadth = input.nextInt();
		
		area = length * breadth;
		perimeter = (length + breadth) * 2;
		
		String greater = area > perimeter ? "Area is greater than the perimeter" : "Area is not greater than the perimeter";
		System.out.println(greater);
		
		input.close();
		

	}

}
