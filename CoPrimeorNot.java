import java.util.Scanner;
public class CoPrimeorNot 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		if(FindGCD(a,b)==1)
		{
			System.out.println("Given a=>"+a+" and b=>"+b+" are Co-primes");
		}
		else
		{
			System.out.println("Given a=>"+a+" and b=>"+b+" are Not Co-primes");
		}
		sc.close();
	}
	static int FindGCD(int a,int b)
	{
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}
