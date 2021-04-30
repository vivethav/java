class account
{
	int a;
	int b;
	public void getdata(int a,int b)
	{
	 this.a=a;
	 this.b=b;
	}
	public void showdata()
	{
	 System.out.println("value of A is  " +a);
	 System.out.println("value of B is  " +b);
	}
}
class demothis2
{
	public static void main(String args[])
	{
	 account obj=new account();
	 obj.getdata(2,3);
	 obj.showdata();
	}
}