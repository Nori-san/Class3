package Activity3;

import java.util.Scanner;

public class Act3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics 
//		and Computer. Calculate percentage and grade according to following:
//		 Percentage >= 90% : Grade A
//		 Percentage >= 80% : Grade B
//		 Percentage >= 70% : Grade C
//		 Percentage >= 60% : Grade D
//		 Percentage >= 40% : Grade E
//		 Percentage < 40% : Grade F
		
		int math, physics, chemistry, biology, computers, avgGrade;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Math Grade: ");
		math = input.nextInt();
		System.out.print("Enter physics Grade: ");
		physics = input.nextInt();
		System.out.print("Enter chemistry Grade: ");
		chemistry = input.nextInt();
		System.out.print("Enter biology Grade: ");
		biology = input.nextInt();
		System.out.print("Enter computers Grade: ");
		computers = input.nextInt();
		
		avgGrade = (math + physics + chemistry + biology + computers) / 5;
		
		if (avgGrade >= 90) {
			System.out.println("Grade A");
		} else if (avgGrade >= 80) {
			System.out.println("Grade B");
		} else if (avgGrade >= 70){
			System.out.println("Grade C");
		} else if (avgGrade >= 60){
			System.out.println("Grade D");
		} else if (avgGrade >= 40){
			System.out.println("Grade E"); 
		} else {
			System.out.println("Grade F"); 
		}
		input.close();


	}

}
