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
	 System.out.println("Name is"+name);
	 System.out.println("Age is"+age);
	 System.out.println("City is"+city);
	}
}
class teacher extends student
{
	String design;
	int salary;
	teacher(String name,int age,String city,String design,int salary)
	{
	 super(name,age,city); //super is used to call base class constructor
	 this.design=design;
	 this.salary=salary;
	}
        public void display1()
	{
	 System.out.println(""+name);
	 System.out.println(""+design);
	 System.out.println(""+salary);
	}
}
class demothisinher
{
	public static void main(String args[])
	{
	 teacher obj=new teacher("vivetha",12,"salem","Trainer",19000);
	 obj.display1();
	}
}