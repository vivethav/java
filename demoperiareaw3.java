class periarea
{
	double radius=7.5;
	double perimeter=2*Math.PI*radius;
	double area=Math.PI*radius*radius;
	public void getdata()
	{
	 System.out.println("Perimeter is = " +perimeter);
	 System.out.println("Area is = " +area);
	}
}
class demoperiareaw3
{
	public static void main(String args[])
	{
	 periarea obj=new periarea();
	 obj.getdata();
	}
}

	