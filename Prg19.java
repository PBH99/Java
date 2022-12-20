// Reverse of any number
package prashant;
import java.util.Scanner;
public class Prg19{

	public static void main(String[] args) {
		
		int a,rem;
		System.out.println("Enter the value of a to get reverse number :: ");
        Scanner o=new Scanner(System.in);
        a=o.nextInt();
       // System.out.flush();
        System.out.println("a = "+a);
        System.out.print("After reverse the digit we get :: ");
        while (a>0)
        {
        	rem=a%10;
        	System.out.print(rem);
        	a=a/10;
        }
	}

}
