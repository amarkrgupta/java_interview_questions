import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// Logic
		
		//All non-century years div by 4 are leap years
		//Only those century years (ending with 00) are leap years which are divisible by 400
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a leap year");
		int year = sc.nextInt();
		
		if(year%100 == 0 && year%400 ==0)
			System.out.println("Leap year!");
		else if(year%100 != 0 && year%4 ==0)
			System.out.println("leap year");
		else
			System.out.println("Not Leap Year");

	}

}
