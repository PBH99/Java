// Write a program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade

package program;

public class Prg26 {

	public static void main(String[] args) {
	   char grade='b';
	   grade=(char)(grade+8);               // we have done typecasting here otherwise it will give integer value 
	   System.out.println(grade);
	   
	   // Decrypting the grade value 
	   grade=(char)(grade-8);
	   System.out.println(grade);

	}

}
