public class Insertion_sort 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		InsertionSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	static void InsertionSort(int A[])
	{
		int i,j,val;
		for(i=1;i<A.length;i++)
		{
			val=A[i];
			for(j=i-1;j>=0 && val<A[j];j--)
			{
				A[j+1]=A[j];
			}
			A[j+1]=val;
		}
	}
}
