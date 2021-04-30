class sample
{
	 public void getdata()
	 {
	  System.out.println("empty method");
	 }
	 public void getdata(int x,int y)
	 {
	  System.out.println(x+y);
	 }
	 public void getdata(String str)
	 {
	  System.out.println("my name is "+str);
	 }
}
class demo4
{
	public static void main(String args[])
	{
	 sample obj=new sample();
         obj.getdata();
	}
}