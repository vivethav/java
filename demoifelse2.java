class sample
{
	public void display()
	{
	 int num1=78;
	 int num2=25;
	 int num3=87;
	 if(num1<num2)
	 {
	  System.out.println("The greatest num is");
	 }
	 else if(num2>num3)
	 {
          System.out.println("The greatest num is");
	 }
	 else
	 {
	  System.out.println("The greatest num is " +num3);
	 }
	}
}
class demoifelse2
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	}
}