import java.util.Scanner;

public class A3dot11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//PSEUDO-CODE
//   INPUT: day, month, year
// PROCESS: how many days in each month including leap year for Feb
//  OUTPUT: the number of days in any month
		
//INPUT: variables month, year, daysOfMonth
	//declare variables and types of variable = whole number = integers	
	int month, year, daysInMonth;
	Scanner in = new Scanner(System.in);
	
//PROCESS: calculate number of days in a month including leap years
	System.out.println("Enter month: ");
		month = in.nextInt();
	System.out.println("Enter year: ");
		year = in.nextInt();
		
	if (month== 1)
		System.out.println("January " +year+ " has 31 days.");
	if (month== 2)
		System.out.println("February " +year+ " has 28 days.");
	if (month== 3)
		System.out.println("March " +year+ " has 31 days.");
	if (month== 4)
		System.out.println("April " +year+ " has 31 days.");
	if (month== 5)
		System.out.println("May " +year+ " has 31 days.");
	if (month== 6)
		System.out.println("June " +year+ " has 31 days.");
	if (month== 7)
		System.out.println("July " +year+ " has 31 days.");
	if (month== 8)
		System.out.println("August " +year+ " has 31 days.");
	if (month== 9)
		System.out.println("September " +year+ " has 31 days.");
	if (month== 10)
		System.out.println("October " +year+ " has 31 days.");
	if (month== 11)
		System.out.println("November " +year+ " has 31 days.");
	if (month== 12)
		System.out.println("December " +year+ " has 31 days.");
//Leap year exception included
	if (month== 2 && year % 4 ==0)
		System.out.println("February " +year+ " is a leap year and has 29 days.");
	
// OUTPUT
	System.out.println("The month " + month + " in " + year + " has " + daysInMonth +".");
	}

}
/*
//if year is divisible by 4, it is a leap year
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}

*/