class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("ID=>"+id);
		System.out.println("NAME=>"+name);
	}
}
public class Main 
{
	public static void main(String args[])
	{
		Student obj=new Student(1,"Nithin");
		obj.display();
	}
}
