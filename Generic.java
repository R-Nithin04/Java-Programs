class Demo<T>
{
	T id;
	Demo(T id)
	{
		this.id=id;
	}
	void display()
	{
		System.out.println("Id->"+id);
	}
}
public class Generic 
{
	public static void main(String args[])
	{
		Demo <Integer>D1=new Demo<>(1);
		D1.display();
		Demo <String>D2=new Demo<>("22751A05C7");
		D2.display();
	}
}
