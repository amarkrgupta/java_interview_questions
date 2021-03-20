import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num of terms");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println("The fibonacci series are as follows:");

		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(b);
		else
		{
			
		}
		
	}

}
