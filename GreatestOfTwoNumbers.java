import java.util.*;
public class GreatestOfTwoNumbers 
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1::");
		num1=sc.nextInt();
		System.out.println("Enter Number 2::");
		num2=sc.nextInt();
		
		//Method 1: Using if-else
		if(num1<num2)
		{
			System.out.println("Num2 => "+num2+" is Greater");
		}
		else if(num1>num2)
		{
			System.out.println("Num1 => "+num1+" is Greater");
		}
		else
		{
			System.out.println("Two Numbers are Equal");
		}
		
		//Method 2: Using Ternary Operator
		
		System.out.println(num1<num2?"Num2 => "+num2+" is Greater":num1>num2?"Num1 => "+num1+" is Greater":"Two Numbers are Equal");
		sc.close();
	}
}
