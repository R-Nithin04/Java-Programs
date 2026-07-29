import java.util.Scanner;
public class FindEvenOdd 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		// Method 1: Using Modulus (%)
		if(n%2==0)
		{
			System.out.println("The given number "+n+" is Even");
		}
		else
		{
			System.out.println("The given number "+n+" is Odd");
		}
		
		// Method 2: Using Bitwise AND (&)
		if((n&1)==0)
		{
			System.out.println("The given number "+n+" is Even");
		}
		else
		{
			System.out.println("The given number "+n+" is Odd");
		}
		
		// Method 3: Using Ternary with %
		System.out.println(n%2==0?"The given number "+n+" is Even":"The given number "+n+" is Odd");
		
		// Method 4: Using Ternary with &
		System.out.println((n&1)==0?"The given number "+n+" is Even":"The given number "+n+" is Odd");
		sc.close();
	}
}
