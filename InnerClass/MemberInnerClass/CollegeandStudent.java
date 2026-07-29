class College
{
	static String college="SITAMS";
	class Student
	{
		String id,name;
		Student(String id,String name)
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
	void display()
	{
		System.out.println("College=>"+college);
	}
}
public class CollegeandStudent 
{
	public static void main(String args[])
	{
		College c=new College();
		College.Student stu=c.new Student("22751A05C7","Nithin");
		stu.display();
		c.display();
		
	}
}
