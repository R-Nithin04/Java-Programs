import java.util.*;
public class Multiple_Exceptions 
{
	public static void main(String args[])
	{
		int a,b;
		int arr[]=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		arr[0]=a=sc.nextInt();
		arr[1]=b=sc.nextInt();
		System.out.println("Enter the index to be accessed:");
		int ind=sc.nextInt();
		try
		{
			System.out.println(a/b);
			System.out.println(arr[ind]);
			System.out.println(Float.parseFloat((Integer.valueOf(a).toString())));
		}
		catch(ArithmeticException E1)
		{
			System.out.println("Can't Divide by 0 "+E1);
		}
		catch(ArrayIndexOutOfBoundsException E2)
		{
			System.out.println("Unable to Access the Array above the index value:"+E2);
		}
		catch(NumberFormatException E3)
		{
				String s="ABC";
				System.out.println(Integer.parseInt(s));
		}
		sc.close();
	}
}
