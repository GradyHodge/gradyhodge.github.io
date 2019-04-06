import java.util.Scanner;

public class A3dot5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter today's date: ");
			int date = in.nextInt();
		System.out.println("Enter the nubmer of days elapsed since today: ");
			int elapsedDays = in.nextInt();
			/*
			if(futureDay== 0)
			{
			    System.out.println("Sunday");
			}
			if(futureDay== 1)
			{
			    System.out.println("Monday");
			}
			if(futureDay== 2)
			{
			    System.out.println("Tuesday");
			}
			if(futureDay== 3)
			{
			    System.out.println("Wednesday");
			}
			if(futureDay== 4)
			{
			    System.out.println("Thursday");
			}
			if(futureDay== 5)
			{
			    System.out.println("Friday");
			}
			if(futureDay== 6)
			{
			System.out.println("Saturday");
			}

			System.out.println("If today is " + date + ", and " + elapsedDays + "go by. Then, today is a, " + newDay);

			  if (future_date == 0){
			        System.out.println("Todays is %s and the future day is Sunday", newDay);
			        }
			        else if(future_date == 1){
			            System.out.println("Todays is %s and the future day is Monday", newDay);
			        }
			        else if(future_date == 2){
			            System.out.println("Todays is %s and the future day is Tuesday", newDay);
			        }
			        else if(future_date == 3){
			            System.out.println("Todays is %s and the future day is Wednesday", newDay);
			        }
			        else if(future_date == 4){
			            System.out.println("Todays is %s and the future day is Thursday", newDay);
			        }
			        else if(future_date == 5){
			            System.out.println("Todays is %s and the future day is Friday", newDay);
			        }
			        else if(future_date == 6){
			            System.out.println("Todays is %s and the future day is Saturday", newDay);
			            
			System.out.println("If today is " + date + ", and " + elapsedDays + "go by. Then, today is a, " + newDay);
			*/
			
		int future_day = (date + elapsedDays) % 7;
		String newDay = " ";
		
		switch(date) {
			case 0: newDay = "Sunday";
				break;
			case 1: newDay = "Monday";
				break;
			case 2: newDay = "Tuesday";
				break;
			case 3: newDay = "Wednesday";
				break;
			case 4: newDay = "Thursday";
				break;
			case 5: newDay = "Friday";
				break;
			case 6: newDay = "Saturday";
				break;
			}
		System.out.println("If today is " + date + ", and " + elapsedDays + "go by. Then, today is a, " + newDay);
	}
	
}


