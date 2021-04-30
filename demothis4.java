class measurement
{
	Double width,height,length;
	public void getdata(double w,double h,double l)
	{
	 this.width=w;
	 this.height=h;
	 this.length=l;
	}
	public void display()
	{
	 System.out.println("Width= " +width);
	 System.out.println("Height= "+height);
	 System.out.println("Length= "+length);
	}
}
class demothis4
{
	public static void main(String args[])
	{
	 measurement obj=new measurement();
	 obj.getdata(50,60,70);
	 obj.display();
	}
}