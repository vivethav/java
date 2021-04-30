class student
{
	String name;
	public void getstudentname()
	{
	 name="vivetha";
	 System.out.println("Name of the student:"  +name);
	}
}
class trainer extends student
{
	public void gettrainername()
	{
	 name="Mr sathish";
	 System.out.println("Name of the trainer:" +name);
	}
}
class demoinher1
{
	public static void main(String args[])
	{
	 trainer obj=new trainer();
	 obj.getstudentname();
	 obj.gettrainername();
	}
}
	 