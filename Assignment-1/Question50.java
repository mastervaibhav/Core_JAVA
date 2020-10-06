package p1;

class Employee
{
	int empid;
	String name;
	public Employee(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}

}
public class Question50
{
	public static void main(String[] args)
	{
		Employee e=new Employee(12324, "Vaibhav");
		System.out.println(e);			                                              
													   
													   
	}
}