class superclass
{
	int age;
	superclass(int age)
	{
	 this.age=age;
	}
	public void getage()
	{
	 System.out.println("The given superclass age is " +age);
	}
}
class subclass extends superclass()
{
	subclass(int age)
	{
	 superclass(age);
	}
}
class demithisinher2
{
	public static void main(String args[])
	{
	 subclass obj=new subclass(24);
	 obj.getage();
	}
}
} 