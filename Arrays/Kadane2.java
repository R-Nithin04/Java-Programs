public class Kadane2 
{
	public static void main(String args[])
	{
		int arr[]={-4,1,3,-7,1,2,8,-6,12,-7};
		System.out.println("Max=>"+maxSubarraySum(arr));
	}
	static int maxSubarraySum(int A[])
	{
		if(A==null||A.length==0)
		{
			return 0;
		}
		int ME=A[0];
		int MF=A[0];
		for(int i=1;i<A.length;i++)
		{
			ME=Math.max(A[i],ME+A[i]);
			MF=Math.max(MF,ME);
		}
		return MF;
	}
}
