import java.util.Scanner;

public class CheckVowel {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		char c = sc.next().charAt(0);
		
		
		if( c== 'a'|| c== 'e' || c=='i' || c=='o' || c=='u' || c== 'A'|| c== 'E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
		
		// Using switch case
		
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("Consonant");
		
		}
	}

}
