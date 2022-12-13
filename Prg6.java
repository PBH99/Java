package prashant;
import java.util.Scanner;
public class Prg6 {

	public static void main(String[] args) {
		int a,b=1;
		System.out.print("Enter the number for factorial = ");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		while (a>0)
		{
			b=b*a;
			a--;
		}
         System.out.print("The factorial of a given number is :: "+b);
	}

}
