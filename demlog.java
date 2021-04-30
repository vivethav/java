class sample
{
	public void display()
	 {
	  System.out.println(0 & 1);
	  System.out.println(true | true);
	  System.out.println(1 | 0);
	  System.out.println(false & true);
	 }
}
class demlog
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	}
}