public class Kadane_MaximumSubarray 
{
	public static void main(String args[]) 
	{
		int arr[]= {-4,1,3,-7,1,2,8,-6,12,-7};
		int cur=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			cur+=arr[i];
			if(cur>max)
			{
				max=cur;
			}
			if(cur<0)
			{
				cur=0;
			}
		}
		System.out.println("Max=>"+max);
	}
}
