package prashant;
import java.util.Scanner;
public class Prg20 {

	public static void main(String[] args) {
		int a,x,count=0;
		System.out.print("Enter any of number to check prime or not :: ");
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		for( x=2; x<=a;x++)
		{
			if(a%x==0)
			{
				count=count+1;
			}
			
		}
		if(count==1)
		{
			System.out.print("The given numberis Prime number");
		}
		else
		{
			System.out.print("The given number is not a Prime number");
		}
	}

}
