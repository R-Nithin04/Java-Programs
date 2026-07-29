import java.util.*;
public class FINDLCM_GCD2 
{
	public static void main(String args[])
	{
		int a,b,gcd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		gcd=FindGCD(a,b);
		System.out.println("GCD=>"+gcd);
		System.out.println("LCM=>"+(a*b/gcd));
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
