package prashant;
import java.util.Scanner;
public class Prg7 {

	public static void main(String[] args) {
		int a;
		System.out.println("\t\t\t******CHECK VOTTING ELIGIBILITY*************");
		System.out.print("Enter your age :: ");
		Scanner o=new Scanner(System.in);
        a=o.nextInt();
        if (a<=18)
        {
        	System.out.print("\t\t\tYou are not eligible for votting ");
        }
        else
        {
        	System.out.print("\t\t\tYou are eligible for votting ");
        }
	}

}
