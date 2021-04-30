import java.io.*;
class ATM
{
	DataInputStream din=new DataInputStream(System.in);
	ATM()
	{
	 try{
	    int balance=Integer.valueOf(din.readLine()).intValue();
	    int withdrawAmount=Integer.valueOf(din.readLine()).intValue();
	    int depositAmount=Integer.valueOf(din.readLine()).intValue();
	    System.out.println("Current Balance=" +balance);
	    System.out.println("Withdrawn operation:");
	    System.out.println("Withdrawing amount=" +withdrawAmount);
	     if(balance>=withdrawAmount)
	      {
	       System.out.println("please collect your money and card");
	      }
	     else
	      {
	       System.out.println("sorry! Insufficient money");
	      }
	       System.out.println("Deposit Operation:");
	       System.out.println("Deposit amount=" +depositAmount);
	       System.out.println("your amount has been deposited");
	       System.out.println("Balance="+(balance-withdrawAmount+depositAmount));
	    }catch(IOException d){}
	}
}
class demoATM1
{
	public static void main(String args[])
	{
	 ATM obj=new ATM();
	}
}
	 
	       	 

	
