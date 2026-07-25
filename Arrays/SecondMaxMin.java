public class SecondMaxMin
{
	public static void main(String[] args) 
	{
		int arr[]= {1,0,2,9,3,8,4,7,5,6};
		if(arr.length==0)
		{
			System.out.println("Empty Array");
		}
		else if(arr.length<2)
		{
			System.out.println("Second Largest and Smallest Does'nt Exist");
		}
		else
		{
			int L=arr[0];
			int SL=Integer.MIN_VALUE;
			int S=arr[0];
			int SS=Integer.MAX_VALUE;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>L)
				{
					SL=L;
					L=arr[i];
				}
				else if(arr[i]<L&&arr[i]>SL)
				{
					SL=arr[i];
				}
				if(arr[i]<S)
				{
					SS=S;
					S=arr[i];
				}
				else if(arr[i]>S&&arr[i]<SS)
				{
					SS=arr[i];
				}
			}
			System.out.println("Largest=> "+L);
			System.out.println("Second Largest=>"+SL);
			System.out.println("Smallest=> "+S);
			System.out.println("Second Smallest=>"+SS);
		}
	}
}
