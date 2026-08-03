import java.util.*;
public class StackCol 
{
	public static void main(String args[])
	{
		Stack <Integer>st=new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println(st);
		
		st.pop();
		
		System.out.println(st);
		
		System.out.println(st.peek());
		
		System.out.println(st.search(2));
		
		System.out.println(st.indexOf(1));
	}
}
