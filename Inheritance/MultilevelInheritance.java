class Person
{
	protected String name;
	Person(String name)
	{
		this.name=name;
	}
	void displayName()
	{
		System.out.println("Name=>"+name);
	}
}
class Employee extends Person
{
	protected int empId;
	Employee(String name,int empId)
	{
		super(name);
		this.empId=empId;
	}
	void displayEmpId()
	{
		System.out.println("EmpId=>"+empId);
	}
}
class Manager extends Employee
{
	protected String department;
	Manager(String name,int empId,String department)
	{
		super(name,empId);
		this.department=department;
	}
	void displayDepartment()
	{
		System.out.println("Department=>"+department);
	}
}
public class MultilevelInheritance 
{
	public static void main(String args[])
	{
		Manager obj=new Manager("Nithin",10002,"Dev");
		obj.displayName();
		obj.displayEmpId();
		obj.displayDepartment();
	}
}
