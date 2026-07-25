public class Merge_sort 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		MergeSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	static void MergeSort(int A[])
	{
		if(A.length<=1)
		{
			return;
		}
		int i;
		int mid=A.length/2;
		int L[]=new int[mid];
		int R[]=new int[A.length-mid];
		for(i=0;i<mid;i++)
		{
			L[i]=A[i];
		}
		for(i=mid;i<A.length;i++)
		{
			R[i-mid]=A[i];
		}
		MergeSort(L);
		MergeSort(R);
		Merge(A,L,R);
	}
	static void Merge(int A[],int L[],int R[])
	{
		int i=0,j=0,k=0;
		for(;i<L.length&&j<R.length;)
		{
			if(L[i]<=R[j])
			{
				A[k++]=L[i++];
			}
			else
			{
				A[k++]=R[j++];
			}
		}
		for(;i<L.length;)
		{
			A[k++]=L[i++];
		}
		for(;j<R.length;)
		{
			A[k++]=R[j++];
		}
	}
}
