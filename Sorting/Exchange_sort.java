public class Exchange_sort 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		ExchangeSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	static void ExchangeSort(int A[])
	{
		for(int i=0;i<A.length-1;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[i])
				{
					int temp=A[j];
					A[j]=A[i];
					A[i]=temp;
				}
			}
		}
	}
}
