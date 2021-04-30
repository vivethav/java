class grandfather
{
	String name;
	public void getgrandfather()
	{
	 name="xxxx";
	 System.out.println("Name of grandfather:" +name);
	}
}
class father extends grandfather
{
	public void getfather()
	{
	 name="yyy";
	 System.out.println("Name of the father:" +name);
	}
}
class child extends father
{
	public void getchild()
	{
	 name="zzz";
	 System.out.println("Name of the child:" +name);
	}
}
class demoinher2
{
	public static void main(String args[])
	{
	 child obj=new child();
	 obj.getgrandfather();
	 obj.getfather();
	 obj.getchild();
	}
}
	