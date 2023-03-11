/* Write a program to find out weather a student is fai or pass :
 * if it requires total 40% and at least 33% in each subject to pass assume three subject 
 * and and take marks as an input from the user 
 */
package program;
import java.util.Scanner;
public class Prg35 {

	public static void main(String[] args) {
		int a,b,c;
		float avg;
		System.out.println("Enter the marks as per subject :: ");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		b=o.nextInt();
		c=o.nextInt();
		avg=(a+b+c)/3;
		if(avg>40 && a>33 && b>33 && c>33)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");

		}
		

	}

}
