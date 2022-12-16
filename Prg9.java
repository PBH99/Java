package prashant;
import java.util.Scanner;
public class Prg9 {
	public static void main(String[]args) {
		int y;
		System.out.println("\t\t\t*****CHECK YEAR IS LEAP YEAR OR COMMON YEAR");
		System.out.print("Enter year no ::  ");
	    Scanner o=new Scanner(System.in);
	    y=o.nextInt();
	    if(((y%4==0) && (y %100!=0)) || (y%400==0))
	    {
	    	System.out.print("The year is leap year");
	    }
	    else
	    {
	    	System.out.print("The year is common year");
	    }
	}

}
