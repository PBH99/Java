// Write a program which asks the user to enter his/her name and greets them with " Hell<name> have a good day"text

package program;
import java.util.Scanner;
public class Prg23 {

	public static void main(String[] args) {
	String name;
	System.out.println("Enter your name :: ");
	Scanner o=new Scanner(System.in);
	name = o.nextLine();
	System.out.println("Hello <"+name+">have a great day");

	}

}
