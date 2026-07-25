public class Findthelargestsmallestelementinanarray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		Find(arr);
	}
	static void Find(int A[])
	{
		int max=A[0],min=A[0];
		for(int i=1;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
			if(A[i]<min)
			{
				min=A[i];
			}
		}
		System.out.println("Max=> "+max);
		System.out.println("Min=> "+min);
	}
}
