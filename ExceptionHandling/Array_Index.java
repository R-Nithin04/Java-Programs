import java.util.*;
public class Array_Index 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index to be accessed");
		int ind=sc.nextInt();
		try
		{
			System.out.println(arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println(" Accessing index above the given array size  "+E);
		}
		finally
		{
			System.out.println("Program Executed Successfully");
		}
		sc.close();
	}
}
