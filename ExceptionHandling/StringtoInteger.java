import java.util.*;
public class StringtoInteger 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		try
		{
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException E)
		{
			System.out.println("Can't convert a string into number "+E);
		}
		finally
		{
			System.out.println("Program Executed Successfully");
		}
		sc.close();
	}
}
