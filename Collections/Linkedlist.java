import java.util.*;
public class Linkedlist 
{
	public static void main(String args[])
	{
		List L=new LinkedList();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		ListIterator it=L.listIterator();
		System.out.println("Normal Order");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Reverse Order");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
}
