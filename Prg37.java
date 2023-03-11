/* Write a progaram to check weather a given year is leap year or not . */

package program;
import java.util.Scanner;
public class Prg37 {

	public static void main(String[] args) {

		int y;
		System.out.print("Enter year :: ");
		Scanner o=new Scanner (System.in);
		y=o.nextInt();
		if(((y % 4 == 0) && (y % 100 != 0 )) || (y % 400 == 0 ))
		{
			System.out.println("The given year is leap year");
		}
		else
		{
			System.out.println("The given year is not a leap year");
		}
	}

}
