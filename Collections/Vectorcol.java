import java.util.*;
public class Vectorcol 
{
	public static void main(String args[])
	{
		Vector <String> vl=new Vector<>();
		
		vl.add("C");
		vl.add("Java");
		vl.add("Python");
		
		System.out.println(vl);
		
		Iterator<String> i=vl.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Enumeration <String>e=vl.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
