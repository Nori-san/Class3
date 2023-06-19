package Activity3;

import java.util.Scanner;

public class Act3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Write a program to input basic salary of an employee and calculate its Gross salary 
//		according to following:
//		 Basic Salary <= 10000 : HRA = 20%, DA = 80%
//		 Basic Salary <= 20000 : HRA = 25%, DA = 90%
//		 Basic Salary > 20000 : HRA = 30%, DA = 95%
		
		double salary, gross, DA, HRA;
		Scanner input = new Scanner(System.in);
		System.out.print("Employees Salary: ");
		salary = input.nextInt();
		
		if (salary <= 10000) {
			DA = salary * 0.2;
			HRA = salary * 0.8;
			gross = salary + DA + HRA;
		} else if (salary <= 20000) { 
			DA = salary * 0.9;
			HRA = salary * 0.25;
			gross = salary + DA + HRA;
		} else {
			DA = salary * 0.95;
			HRA = salary * 0.3;
			gross = salary + DA + HRA;
		}
		
		System.out.println(gross);
		input.close();

	}

}
