//  Write a java program to detect double or triple spaces in a program

package program;
import java.util.Scanner;
public class Prg33 {

	public static void main(String[] args) {
		String text ;
		System.out.println("Enter the string :: ");
        Scanner o=new Scanner(System.in);
        text=o.nextLine();
       // System.out.println("count of double spaces "+text.indexOf("  "));
	   // System.out.println("count of triple spaces "+text.indexOf("   "));
	    
        System.out.println(text.indexOf("  "));
	    System.out.println(text.indexOf("   "));
	    
	    
	}

}
