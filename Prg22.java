// Write a program to calculate CGPA using marks of three subjects (out of 100)

package program;
import java.util.Scanner;
public class Prg22 {

	public static void main(String[] args) {
		
	int a,b,c,sum;
	float per,cp;
	//double cp;
	System.out.println("Enter the marks of three subjects :: ");
	Scanner o=new Scanner(System.in);
	a=o.nextInt();
	b=o.nextInt();
	c=o.nextInt();
	sum=a+b+c;
	System.out.println("Subject 1 :: "+a);
	System.out.println("Subject 1 :: "+b);
	System.out.println("Subject 1 :: "+c);
	System.out.println("Total of all three subject is :: "+sum);	
	per=sum/3;
	System.out.println("The percentage as per given marks :: "+per);
	cp=sum/30;
	System.out.println("CGPA as per given marks "+cp);
	
	}

}
