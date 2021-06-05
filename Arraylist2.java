import java.util.ArrayList;
import java.util.Collections;
class sample
{
	public void getdata()
	{
	 ArrayList<Integer>myNumbers=new ArrayList<Integer>();
	 myNumbers.add(10);
	 myNumbers.add(13);
	 myNumbers.add(45);
	 myNumbers.add(12);
	 myNumbers.add(90);
	 Collections.sort(myNumbers);
	 System.out.println(myNumbers);
	}
}
class Arraylist2
{
	public static void main(String[] args)
	{
	 sample obj=new sample();
	 obj.getdata();
	}
}
	 