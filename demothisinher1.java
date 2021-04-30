class student 
{
	String name,city;
	int age;
	student(String name,int age,String city)
	{
	 this.name=name;
	 this.age=age;
	 this.city=city;
	}
	public void display()
	{
	 System.out.println("Name is " +name);
	 System.out.println("Age is " +age);
	 System.out.println("City is " +city);
	}
}
class teacher extends student
{
	String designation;
	int salary;
	teacher(String name,int age,String city,String designation,int salary)
	{
	 super(name,age,city);
	 this.designation=designation;
	 this.salary=salary;
	}
	public void display1()
	{
	 System.out.println("Name is " +name);
	 System.out.println("Designation is " +designation);
	 System.out.println("Salary is " +salary);
	}
}
class demothisinher1
{
	public static void main(String args[])
	{
	 teacher obj=new teacher("Vivetha",22,"Salem","Trainer",20000);
	 obj.display1();
	}
}