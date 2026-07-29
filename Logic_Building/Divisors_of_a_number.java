import java.util.Scanner;
public class Divisors_of_a_number 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Enter Valid Number");
		}
		else
		{
		// Approach 1: Brute Force - O(n)
		System.out.println("Approach 1 (Brute Force):");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		// Approach 2: Optimized using divisor pairs - O(√n)
		System.out.println("\nApproach 2 (Optimized using divisor pairs):");
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				if(i!=n/i)
				{
					System.out.print(n/i+" ");
				}
			}
		}
		// Approach 3: Same optimization using Math.sqrt() - O(√n)
		System.out.println("\nApproach 3 (Using Math.sqrt()):");
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				if(i!=n/i)
				{
					System.out.print(n/i+" ");
				}
			}
		}
	}
	sc.close();
	}
}
