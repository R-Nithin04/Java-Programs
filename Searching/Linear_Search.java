public class Linear_Search 
{
	public static void main(String args[])
	{
		int arr[]= {3,1,2,6,7,8},K=7;
		int val=LinearSearch(arr,K),val2=RLinearSearch(arr,0,K);
		if(val!=-1)
		{
			System.out.println("Element "+K+" is found at "+val);
		}
		else
		{
			System.out.println("Element not found");
		}
		
		//Recursion
		if(val2!=-1)
		{
			System.out.println("Element "+K+" is found at "+val2);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}
	
	//Using Loops
	static int LinearSearch(int A[],int K)
	{
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==K)
			{
				return i;
			}
		}
		return -1;
	}
	
	//Using Recursion
	static int RLinearSearch(int A[],int i,int K)
	{
		if(i==A.length)
		{
			return -1;
		}
		if(A[i]==K)
		{
			return i;
		}
		return	RLinearSearch(A,i+1,K);
	}
}
