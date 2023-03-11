/* Write a program to sum frist n even numbers using while loop .*/

package program;
import java.util.Scanner;
public class Prg40 {

	public static void main(String[] args) {
     int n=0,x,sum=0;
     System.out.println("Enter the value of x ");
     Scanner o=new Scanner(System.in);
     x=o.nextInt();
     while(n<x)
     {
    	 if(n%2==0)
    	 {
    		 System.out.println("The even numbers are :: "+n);
    		 sum=sum+n;
    		 //n++;
    	 }
    	 n++;
      }
     System.out.println("The sum of the given even :: "+sum); 
	}

}
