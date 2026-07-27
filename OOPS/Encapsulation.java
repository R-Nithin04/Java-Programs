class StudentDemo
{
    private String name;
    private int age;

    StudentDemo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        StudentDemo s=new StudentDemo("Nithin",21);
        s.display();

        // s.age = 30;   // Error because age is private
    }
}