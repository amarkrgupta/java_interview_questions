
public class SwapTwoNums {
	
	public static void main(String args[])
	{
		int a =10;
		int b =20;
		
		//using third variable
		int temp=0;
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}