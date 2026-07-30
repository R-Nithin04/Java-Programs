import java.util.*;
public class ArrLst 
{
	public static void main(String args[])
	{
		List AL=new ArrayList();
		AL.add("A");
		AL.add("B");
		AL.add("C");
		AL.add(12);
		Iterator it=AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
