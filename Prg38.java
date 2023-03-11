/* Write a program to find the out the type of website from the url 
 *   .com -> commercial website
 *   .in  -> indian website
 *   .org -> organisation website
 */

package program;
import java.util.Scanner;
public class Prg38 {

	public static void main(String[] args) {
        String web;
		System.out.println("Enter the website name to check the type of that website :: ");
        Scanner o=new Scanner(System.in);
        web=o.nextLine();
        if(web.endsWith("com"))
        {
        	System.out.println("The given website is commmercial website");
        }
        else if(web.endsWith("in"))
        {
        	System.out.println("The given website is indian website ");
        }
        else
        {
        	System.out.println("The given website is organisation website ");
        }
	}

}
