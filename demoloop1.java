class sample
{
	sample()
	{
	 for(int i=0;i<=5;i++)
	 {
	  for(int j=0;j<=6-i;j++)
	  {
	   System.out.print("*");
	  }
	   System.out.println("");
	 }
	}
}
class demoloop1
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}