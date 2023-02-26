package program;

public class Prg21 {

	public static void main(String[] args) {
		
		int a=0,sum1=0,sum2=0;
		while(a<20)
		{
			if(a%2==0)
			{
			    System.out.println("Even numbers "+a);
				sum1=sum1+a;
			}
			else
			{
				System.out.println("Odd numbers "+a);
				sum2=sum2+a;
			}
			a++;
		}
		System.out.println("Sum of the all even  number is :: "+sum1);
		System.out.println("Sum of the all  odd number is :: "+sum2);

		
		
	}

}
