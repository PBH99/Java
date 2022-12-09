package pr1;
import java.util.Scanner;

public class Prg3 {
	 
	public static void main(String[]args)
	{
		int a,b,c;
		System.out.print("Enter the value of a and b ");
        Scanner z=new Scanner(System.in);
        a=z.nextInt();
        b=z.nextInt();
       // c=z.nextInt();
        c=a+b;
        System.out.print("The sum of two given numbers"+c);
	}
}
