class sample
{
	String str="vivetha";
	int x=10;
	public void getdata()
	{
	 System.out.println("Inside getdata " +str +x);
	}
	public void display()
	{
	 this.getdata();
	 System.out.println("called");
	}
}
class demothis9
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	}
}

	