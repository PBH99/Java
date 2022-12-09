package pr1;
  import java.util.Scanner;
  

public class Prg4 {
	
	public static void main(String[]args)
	{
		int a,b;
		System.out.print("Enter the value of a and b for swapping :: \n");
		Scanner z=new Scanner(System.in);
		//Systemcls();
		
	
		a=z.nextInt();
		b=z.nextInt();
	      
		System.out.print("\n\nBefore Swapping the value of a is ::"+a);
		System.out.print("\nBefore Swapping the value of a is ::"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n\nAfter Swapping the value of a  is ::"+a);
		System.out.print("\nAfter Swapping the value of a  is ::"+b);
	}
	
}
