package Activity3;

public class Act3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 A library charges a fine for every book returned late. For first 5 days the fine is 50 paise, for 
//		 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the book after 30 
//		 days your membership will be cancelled. Write a program to accept the number of days the 
//		 member is late to return the book and display the fine or the appropriate message
		
		int daysLate = 10;
		if (daysLate > 0 && daysLate <= 5) {
			System.out.print("Your late fees cost 50 paise");
		} else if (daysLate > 5 && daysLate <= 10) {
			System.out.print("Your late fees cost one rupee");
		} else if (daysLate > 10 && daysLate <= 30) {
			System.out.print("Your late fees cost 5 rupees");
		} else {
			System.out.print("Your membership is cancelled");
		}

	}

}
