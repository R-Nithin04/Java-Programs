public class Binary_Search 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		int K=7;
		Sort(arr);
		int val=BinarySearch(arr,K);
		int val2=RBinarySearch(arr,0,arr.length-1,K);
		
		//Using Loops
		if(val!=-1)
		{
			System.out.println("Element "+K+" is found at "+val);
		}
		else
		{
			System.out.println("Element not found");
		}
		
		//Using Recursion
		if(val2!=-1)
		{
			System.out.println("Element "+K+" is found at "+val2);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
	static void Sort(int A[])
	{
		for(int i=0;i<A.length-1;i++)
		{
			for(int j=0;j<A.length-i-1;j++)
			{
				if(A[j]>A[j+1])
				{
					A[j]=A[j]^A[j+1];
					A[j+1]=A[j]^A[j+1];
					A[j]=A[j]^A[j+1];
				}
			}
		}
	}
	static int BinarySearch(int A[],int K)
	{
		int L=0,H=A.length-1,M;
		while(L<=H)
		{
			M=L+(H-L)/2;
			if(A[M]==K)
			{
				return M;
			}
			else if(A[M]<K)
			{
				L=M+1;
			}
			else
			{
				H=M-1;
			}
		}
		return -1;
	}
	static int RBinarySearch(int A[],int L,int H,int K)
	{
		if(L>H)
		{
			return -1;
		}
		int M=L+(H-L)/2;
		if(A[M]==K)
		{
			return M;
		}
		else if(A[M]<K)
		{
			return RBinarySearch(A,M+1,H,K);
		}
		else
		{
			return RBinarySearch(A,L,M-1,K);
		}
	}
}
