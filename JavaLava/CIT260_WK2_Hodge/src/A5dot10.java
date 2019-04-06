
public class A5dot10 {
/*PSEUDO-CODE
 *   INPUT: nothing
 * PROCESS: find numbers that are divisible by BOTH 5 and 6
 *  OUTPUT: display 10 numbers per line...???
*/
	public static void main(String[] args) {
//INPUT
		int j = 1;
		int ComNum = 100;
/*PROCESS: 
 * separate into 2 different loops
 * one loop finds numbers, the other loop limits output into rows of 10
 * use an AND statement or an OR statement depending on how you interpret
 * assuming more numbers will be found to fit into rows of 10 with then an OR statement should be selected
 */
		While (ComNum < 1001) {
			for (int i = 100; i <= 1000; i++) {
				if (i % 5 == 0 || i % 6 == 0) {
					System.out.println(ComNum, " ");
					j++;
				}
				if (j % 10 == 0) {
					System.out.println();
				}
				ComNum++;
			}	
		}
	}
}


/* Java While Loop
   public class Test {

   public static void main(String args[]) {
      int x = 10;

      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}
*/
