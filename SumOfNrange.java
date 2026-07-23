import java.util.Scanner;
public class SumOfNrange 
{
	public static void main(String args[])
	{
		int L,R,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting Value:");
		L=sc.nextInt();
		System.out.println("Enter the Ending Value");
		R=sc.nextInt();
		//Method 1:Using Loops
		if(L<=0||R<=0||R<L)
		{
			System.out.println("Enter a Valid Number");
		}
		else
		{
			
			for(int i=L;i<=R;i++)
			{
				sum+=i;
			}
			System.out.println("The Sum of Natural Numbers within given range is "+sum);
			//Method 2:Recursion
			System.out.println("The Sum of Natural Numbers within given range is "+Sum(0,L,R));
			//Method 3:Using Mathematical Formula
			System.out.println("The Sum of Natural Numbers within given range is "+((R*(R+1)/2)-((L-1)*L/2)));
		}
		sc.close();
	}
	static int Sum(int sum,int i,int n)
	{
		if(i>n)
		{
			return sum;
		}
		return Sum(sum+i,i+1,n);
	}
}
