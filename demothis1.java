class student
{
	int rollno;
	String name;
	float fee;
	public void getdata(int rollno,String name,float fee)
	{
	 this.rollno=rollno;
	 this.name=name;
	 this.fee=fee;
	}
	public void display()
	{
	 System.out.println("The Student rollno :" +rollno);
	 System.out.println("The Student name :"  +name);
	 System.out.println("The Student fee :"  +fee);
	}
}
class demothis1
{
	public static void main(String args[])
	{
	 student obj=new student();
	 obj.getdata(28,"vive",11000f);
	 obj.display();
	}
}