package Activity3;

import java.util.Scanner;

public class Act3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic 
//		salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of 
//		basic salary. If the employee's salary is input through the keyboard write a program to find his 
//		gross salary
		
		double salary, gross, DA, HRA;
		Scanner input = new Scanner(System.in);
		System.out.print("Employees Salary: ");
		salary = input.nextInt();
		
		if (salary < 1500) {
			DA = salary * 0.1;
			HRA = salary * 0.9;
			gross = salary + DA + HRA;
		} else { 
			DA = salary * 0.98;
			HRA = salary;
			gross = salary + DA + HRA;
		}
		
		System.out.println(gross);
		input.close();
	}

}
