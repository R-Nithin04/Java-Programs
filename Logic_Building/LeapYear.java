import java.util.*;
public class LeapYear 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int n=sc.nextInt();
		// Don't use only (n % 4 == 0); it is not sufficient for leap year calculation.
		//Method 1:Using if-else
		if(n<=0)
		{
			System.out.println("Enter Valid Year");
		}
		else if((n%400==0)||(n%4==0&&n%100!=0))
		{
			System.out.println("The Year "+n+" is a Leap Year");
		}
		else
		{
			System.out.println("The Year "+n+" is not a Leap Year");
		}
		//Method 2:Using Ternary
		System.out.println(n<=0?"Enter Valid Year":(n%400==0)||(n%4==0&&n%100!=0)?"The Year "+n+" is a Leap Year":"The  Year "+n+" is not a Leap Year");
		sc.close();
	}
}
