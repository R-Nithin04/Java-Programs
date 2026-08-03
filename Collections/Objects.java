import java.util.*;
public class Objects 
{
	public static void main(String args[])
	{
		List lst=new ArrayList();
		
		lst.add(10);
		lst.add(10.5f);
		lst.add("Java");
		lst.add('C');
		lst.add(true);
		
		System.out.println(lst);
		
		Integer num=(Integer)lst.get(0);
		Float val=(Float)lst.get(1);
		String str=(String)lst.get(2);
		Character chr=(Character)lst.get(3);
		Boolean bool=(Boolean)lst.get(4);
		
		System.out.println(num);
		System.out.println(val);
		System.out.println(str);
		System.out.println(chr);
		System.out.println(bool);
	}
}
