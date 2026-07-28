public class NullString 
{
	public static void main(String args[])
	{
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException E)
		{
			System.out.println("Can't modify or access a Null String "+E);
		}
		finally
		{
			System.out.println("Program Executed");
		}
	}
}
