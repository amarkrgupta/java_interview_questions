import java.util.Scanner;

public class AlphabetOrNot {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		int i = (int)ch;
		
		if((i>=65 && i<=90) || (i>=97 && i<=122))
			System.out.println(ch+" is an alphabet");
		else
			System.out.println(ch+" is not an alphabet");
	}

}
