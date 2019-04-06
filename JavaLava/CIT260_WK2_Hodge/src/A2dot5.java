
public class A2dot5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Scanner;
		//import java.util.Scanner*;
			 
			 class CalculateTip {
				 
			public static void main(String[] args) {
			
				float subtotal, gratutityRate, gratuity, total;
				Scanner in = new Scanner(System.in);
				
				System.out.println("enter subtotal: ");
					subtotal = in.nextInt();
				Systemt.out.println("enter gratuity rate: ");
					gratuityRate = in.nextInt();
				
				gratuity = gratuityRate * subtotal;
				
				total = gratuity + subtotal;
				
				System.out.println("your meal plus tip is: " + total);
				
			/* int radius, volume, height; 
			Scanner in =  new Scanner(System.in );
			
			System.out.println("enter the radius of the cylinder: ");
			radius = in.nextInt ();
			System.out.println("enter the height of the cylinder: ");
			height = in.nextInt();
			
			volume = Math.PI * radius * radius * height;
			
			 float   temp;
				     Scanner in = new Scanner(System.in );
				     System.out.println("Enter temp in Fehranheit");
				         temp = in.nextInt();
				         temp = ((temp - 32)*5)/9;
				
				System.out.println("temp in C = " + temp);
			*/
	}

}
