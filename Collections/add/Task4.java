import java.util.*;
public class Task4 
{
	public static void main(String args[])
	{
		List<Integer>l=new ArrayList<>();
		for(int i=2;i<=100;i++)
		{
			if((i&1)==0)
			{
				l.add(i);
			}
		}
		System.out.print(l);
	}
}
