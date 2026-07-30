class Animal
{
	protected String name;
	protected int age;
	void eat()
	{
		System.out.println("Animal Name=>"+name+" Age=>"+age+" Is Eating");
	}
}
class Dog extends Animal
{
	Dog(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}
public class SingleInheritance 
{
	public static void main(String args[])
	{
		Dog obj=new Dog("SNOOZY",7);
		obj.eat();
		obj.bark();
	}
}