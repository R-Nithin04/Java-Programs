public class Selection_sort 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		SelectionSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	static void SelectionSort(int A[])
	{
		for(int i=0;i<A.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=A[min];
				A[min]=A[i];
				A[i]=temp;
			}
		}
	}
}
