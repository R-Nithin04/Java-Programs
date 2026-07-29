import java.util.Scanner;
public class Find_Positive_Negative 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n::");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("n=> "+n+" Is a Negative Number");
		}
		else if(n>0)
		{
			System.out.println("n=> "+n+" Is a Positive Number");
		}
		else
		{
			System.out.println("N is Zero");
		}
		
		//OR USING TERNARY OPERATOR
		
		System.out.println(n<0?n+" Is Negative":n>0?n+" Is Positive":n+"Is Zero");
		sc.close();
	}
}
