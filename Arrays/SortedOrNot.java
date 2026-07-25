public class SortedOrNot 
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		System.out.println("Sorted=>"+Sorted(arr));
	}
	static boolean Sorted(int A[])
	{
		if(A.length<=1)
		{
			return true;
		}
		else
		{
			for(int i=0;i<A.length-1;i++)
			{
				if(A[i]<=A[i+1])
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
	}
}
