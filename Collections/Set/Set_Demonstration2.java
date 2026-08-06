import java.util.*;
public class Set_Demonstration2 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();		
		
		for(int x:arr)
		{
			if(!lhs.add(x))
			{
				System.out.println("Duplictaion exists");
				return;
			}
		}
		System.out.println("No Duplicates");
	}
}
