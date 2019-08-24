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
	
		
		
	
		/* Create a schoolBand method to prompt user for the minutes for Monday and Tuesday
		 * add the minutes together and output total.
		 */
		public void schoolBand() {
			
			Scanner input  = new Scanner(System.in);
			int totalMinutes;
			int monday;
			int tuesday;
			
		
		    System.out.println("Enter the number of minutes for Monday:");
		    monday = input.nextInt();
		    System.out.println("");
		    
		    System.out.println("Enter the number of minutes for Tuesday:");
		    tuesday = input.nextInt();
		    System.out.println("");
		    totalMinutes = monday + tuesday;
		    System.out.println("Total minutes for Monday and Tuesday is:" + totalMinutes);
		    System.out.println("Total minutes for Monday and Tuesday from the calculateMinutesInt() is :" + calculateMinutesInt(monday, tuesday));
		    calculateMinutesVoid(monday, tuesday);
		    System.out.println("Total minutes for Monday and Tuesday from the calculateMinutesDouble() is :" + calculateMinutesDouble(monday, tuesday));
		}
		
		//Calculate minutes with an int return type
		public int calculateMinutesInt(int monday, int tuesday){
			return monday + tuesday;
			
		}
		
		//Calculate minutes in a void method
		public void calculateMinutesVoid(int monday, int tuesday) {
			int totalMinutes = monday + tuesday;
			System.out.println("Total minutes for Monday and Tuesday from the calculateMinutesVoid() is :" + totalMinutes);
		}
		
		//Calculate minutes with a double return type
		public double calculateMinutesDouble(double monday, double tuesday) {
			return monday + tuesday;
			
		}
		
		
		
		
		public static void main(String[] args) {
			SchoolBandProblem test1 = new SchoolBandProblem();
			test1.schoolBand();
		}

	
	

}
