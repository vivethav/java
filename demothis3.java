class sample
{
	int x;
	public void getdata(int x)
	{
	 this.x=x;
	}
	public void display()
	{
	 System.out.println("The value of X is" +x);
	}
}
class demothis3
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.getdata(5);
	 obj.display();
	}
} 