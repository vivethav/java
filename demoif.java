class sample
{
	int number=10;
	public void display()
	{
	 if(number>10)
	 {
          System.out.println("The number is 10");
	 }
	 else if(number==11)
	 {
	  System.out.println("The statement is block");
	 }
	 else
	 {
	  System.out.println("The output is true");
	 }
	}
}
class demoif
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();	
	}
}