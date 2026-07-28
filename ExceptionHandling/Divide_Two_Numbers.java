import java.util.*;
public class Divide_Two_Numbers 
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		sc.close();
		try
		{
			System.out.println("Division=>"+a/b);
		}
		catch(ArithmeticException E)
		{
			System.out.println("Can't Divide a number by 0 "+E);
		}
		finally
		{
			System.out.println("Program Executed Successfully");
		}
	}
}
