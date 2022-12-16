package prashant;
import java.util.Scanner;
public class Prg8 {

	public static void main(String[] args) {
		int a;
		System.out.print("Enter any number to check even or odd");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		if(a%2==0)
		{
			System.out.print("The given number is even number ");
		}
		else
		{
			System.out.print("The given number is odd ");
		}

	}

}
