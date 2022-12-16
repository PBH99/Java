
// PRECENDENCE AND ASSOCIATIVITY   ( Left to right )
package prashant;

public class Prg11 {

	public static void main(String[] args) {
		
		int a=6*5 - 34/2;
		/* Heighest precendence goes to * and /.a they are then evaluated on the basis 
		of left to right associativity
		= 38 - 34/2
		= 38 - 17
		= 13
		*/
		int b= 60/5 - 34*2;
		
		/* 
		 = 12 -34*2
		 = 12 - 68
		 = -56
		 */
		System.out.println(a);
		System.out.print(b);
		
	}

}
