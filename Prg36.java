/* Calculate income tax paid by an employee to the government as per the slabs mentioned below :
 *               Income slabs                  Tax
 *                 2.5L-5.0L                    5%
 *                 5.0L-10L                     20%
 *                 10L-above                    30%
 * Note that there is no tax less than 2.5 lakh take input amount as an input from the user
 */

package program;
import java.util.Scanner;
public class Prg36 {

	public static void main(String[] args) {
		double a,tax;
     System.out.println("Enter the amount to find the payable tax as per instruction :: ");
	 Scanner o=new Scanner (System.in);
	 a=o.nextDouble();
	 
	 if(a<250000)
	 {
		 System.out.println("There is no tax to  pay at this amount ");
	 }
	 else if(a>250000 && a<500000)
	 {
	  tax=(a*5)/100;
	  System.out.println("The payable tax is :: "+tax);
	 }
	 else if(a>500000 && a<1000000)
	 {
		 tax=(a*20)/100;
		  System.out.println("The payable tax is :: "+tax);
	 }
	 else 
	 {
		 tax=(a*30)/100;
		  System.out.println("The payable tax is :: "+tax);
	 }
	 
	
	}

}
