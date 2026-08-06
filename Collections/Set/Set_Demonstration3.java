import java.util.*;
public class Set_Demonstration3 
{
	public static void main(String args[])
	{
		int arr[]= {1,1,2,2,4,3,5,2,6};
		LinkedHashSet<Integer> s=new LinkedHashSet<>();
		for(int i:arr)
		{
			if(s.add(i)==false)
			{
				System.out.println("Duplication found");
				System.out.println("First duplication value:"+i);
				return;
			}
		}
		System.out.println("No duplication exist");
	}
}
