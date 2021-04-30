class sample
{
	sample()
	{
	 int num=2;
	 System.out.println("The Entered num is " +num);
	 System.out.println("Multiplication table of " +num);
	 for(int i=1;i<11;i++)
	 {
	  System.out.println(num+ "*" +i +"=");
	 }
	}
}
class demomulfor
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
} 