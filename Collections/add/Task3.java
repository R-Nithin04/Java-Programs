import java.util.*;
public class Task3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>l=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Element:"+(i+1));
			l.add(sc.nextInt());
		}
		System.out.println(l);
		sc.close();
	}
}
