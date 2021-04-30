class sample
{
	public void display()
	{
	 int x=1,y=-2;
	 if(x==-2)
	 {
	  System.out.println("The number is positive");
	 }
	 else if(y==1)
	 {
	  System.out.println("The number is negative");
	 }
	 else
	 {
	  System.out.println("The statements are true");
	 }
	}
}
class demoifelse
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	}
}