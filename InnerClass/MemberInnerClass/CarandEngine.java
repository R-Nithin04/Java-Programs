class Car
{
	class Engine
	{
		void print()
		{
			System.out.println("Engine Type=>BS6");
			System.out.println("Engine Power=>20HP");
			System.out.println("Engine Cylinders=>4 Cylinders");
		}
	}
}
public class CarandEngine 
{
	public static void main(String args[])
	{
		Car c=new Car();
		Car.Engine i=c.new Engine();
		i.print();
	}
}
