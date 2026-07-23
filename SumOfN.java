import java.util.Scanner;
public class SumOfN 
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		//Method 1:Using Loops
		if(n<=0)
		{
			System.out.println("Enter a Valid Number");
		}
		else
		{
			
			for(int i=1;i<=n;i++)
			{
				sum+=i;
			}
			System.out.println("The Sum of "+n+" Natural Numbers is "+sum);
			//Method 2:Recursion
			System.out.println("The Sum of "+n+" Natural Numbers is "+Sum(n));
			//Method 3:Using Mathematical Formula
			System.out.println("The Sum of "+n+" Natural Numbers is "+(n*(n+1)/2));
		}
		sc.close();
	}
	static int Sum(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		return n+Sum(n-1);
	}
}
