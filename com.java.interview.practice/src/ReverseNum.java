import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int rem=0;
		int rev=0;
		
		while(n>0)
		{
			rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The reverse of the num = "+rev);
		
	}

}
