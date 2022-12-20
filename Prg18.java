// Fibonacci series
package prashant;

public class Prg18 {

	public static void main(String[] args) {
		int a=0,b=1,x,nt;
		System.out.print(a+" "+b);
		for(x=2;x<20;++x)
		{
			nt=a+b;
			System.out.print(" "+nt);
			a=b;
			b=nt;
		}

	}

}
