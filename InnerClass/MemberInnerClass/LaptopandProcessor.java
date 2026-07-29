class Laptop
{
	String Brand,RAM,SSD;
	class Processor
	{
		void Setter(String Brand,String RAM,String SSD)
		{
			Laptop.this.Brand=Brand;
			Laptop.this.RAM=RAM;
			Laptop.this.SSD=SSD;
		}
	}
	void display()
	{
		System.out.println("Brand=>"+Brand);
		System.out.println("RAM=>"+RAM);
		System.out.println("SSD=>"+SSD);
	}
}
public class LaptopandProcessor 
{
	public static void main(String args[])
	{
		Laptop L=new Laptop();
		Laptop.Processor P=L.new Processor();
		P.Setter("DELL","8GB","256GB");
		L.display();
	}
}
