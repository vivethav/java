class sample
{
	int x,y;
	public void getdata(int x,int y)
	 {
	  System.out.println(x+y);
	 }
}
class add2
{
	public static void main(String args[])
	 {
	  sample obj=new sample();
	  obj.getdata(10,90);
	 }
}