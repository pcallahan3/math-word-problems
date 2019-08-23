package schoolbandproblem;

import java.util.Scanner;

/*
 * ---------------QUESTION---------
 * 
 * The school band is getting ready for a concert.
   They practiced 115 minutes on Monday and 125 minutes on Tuesday.
   How many minutes did the band practice on both days?
 */
public class SchoolBandProblem {
	
		private static Scanner input  = new Scanner(System.in);
		int totalMinutes;
		
		
	
		/* Create a schoolBand method to prompt user for the minutes for Monday and Tuesday
		 * add the minutes together and output total.
		 */
		public void schoolBand() {
		
		    System.out.println("Enter the number of minutes for Monday:");
		    int monday = input.nextInt();
		    System.out.println("");
		    
		    System.out.println("Enter the number of minutes for Tuesday:");
		    int tuesday = input.nextInt();
		    System.out.println("");
		    totalMinutes = monday + tuesday;
		    System.out.println("Total minutes for Monday and Tuesday is:" + totalMinutes);
		    
	}
	

	public static void main(String[] args) {
		SchoolBandProblem test1 = new SchoolBandProblem();
		test1.schoolBand();
	

	}

}
