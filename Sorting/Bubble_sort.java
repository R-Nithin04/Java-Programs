public class Bubble_sort 
{
	public static void main(String args[])
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		Bubblesort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	static void Bubblesort(int A[])
	{
		int temp;
		for(int i=0;i<A.length-1;i++)
		{
			for(int j=0;j<A.length-i-1;j++)
			{
				if(A[j]>A[j+1])
				{
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
	}
}
