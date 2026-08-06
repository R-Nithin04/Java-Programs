import java.util.*;
public class Set_Demonstration 
{
	public static void main(String args[])
	{
		int arr[]= {1,1,2,2,4,3,5,2,6};
		LinkedHashSet<Integer> s=new LinkedHashSet<>();
		for(int i:arr)
		{
			s.add(i);
		}
		System.out.println(s);
	}
}
