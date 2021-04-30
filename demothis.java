class sample
{
	String name,city;
	int age;
	public void getdata(String name,int age,String city)
	{
	 this.name=name;
	 this.age=age;
	 this.city=city;
	}
	public void display()
	{
	 System.out.println("Name of the student "  +name);
         System.out.println("Age of the student "  +age);
	 System.out.println("City of the student "  +city);
	}
}
class demothis
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata("Vivetha",22,"Salem");
	 obj.display();
	}
}
	 