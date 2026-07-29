import java.util.*;
public class Greatest_of_3numbers 
{	
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Enter value of c:");
		c=sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("a=>"+a+" is greater");
		}
		else if(b>=c)
		{
			System.out.println("b=>"+b+" is greater");
		}
		else
		{
			System.out.println("c=>"+c+" is greater");
		}
		System.out.println(a>=b && a>=c?"a=>"+a+" is greater":b>=c?"b=>"+b+" is greater":"c=>"+c+" is greater");
		sc.close();
	}
}
