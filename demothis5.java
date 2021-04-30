class employee
{
	String name;
	int age;
	float salary;
	public void getdata(String name,int age,float salary)
	{
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
	}
	public void showdata()
	{
	 System.out.println("The employee's name is "  +name);
	 System.out.println("The employee's age is  "  +name);
	 System.out.println("The employee's salary is " +name);
	}
}
class demothis5
{
	public static void main(String args[])
	{
	 employee obj=new employee();
	 obj.getdata("vivetha",22,30000f);
	 obj.showdata();
	}
}
	 