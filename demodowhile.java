class sample
{
	int x=21,sum=0;
	sample()
	{
	 do
	 {
	  sum +=x;
	  x--;
	 }while(x>10);
	}
}
class dowhile
{
	public static void main(String args[])
	{
	 sample obj=new sample();
	}
}