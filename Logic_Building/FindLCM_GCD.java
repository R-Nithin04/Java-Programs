import java.util.*;
public class FindLCM_GCD 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		findGCD1(a,b);
		sc.close();
	}
	static void findGCD1(int a,int b)
	{
		int min,gcd=0;
		min=a<b?a:b;
		for(int i=1;i<=min;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD=>"+gcd);
		findLCM(a,b,gcd);
	}
	static void findLCM(int a,int b,int gcd)
	{
		int lcm=(a*b)/gcd;
		System.out.println("LCM=>"+lcm);
	}
}
