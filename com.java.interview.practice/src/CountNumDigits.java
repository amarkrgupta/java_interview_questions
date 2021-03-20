import java.util.Scanner;

public class CountNumDigits {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ");
		int n = sc.nextInt();
		
		int dup =n;
		int count= 0;
		int rem =0;
		
		while(dup>0)
		{
			rem = dup%10;
			dup = dup/10;
			count++;
		}
		System.out.println("The total digits for "+n+" are= "+count);
		
	}

}
