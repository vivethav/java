class ATM
{
	int balance=10000;
	int withdrawAmount=5000;
	int depositAmount=2000;
	public void displaycurrentbalance()
	{
	 System.out.println("Current Balance " +balance);
	}
	public void amountwithdrawing()
	{
	 System.out.println("Withdrawn Operation:");
	 System.out.println("Withdrawing amount=" +withdrawAmount);
	 if(balance>=withdrawAmount)
	  {
	   System.out.println("please collect your money and card");
	  }
	 else
	  {
	   System.out.println("sorry! Insufficient amount");
	  }
	}
	public void amountdeposit()
	{
	 System.out.println("Deposit Operation:");
	 System.out.println("Deposit amount=" +depositAmount);
	 System.out.println("your amount has been successfully deposited");
	 System.out.println("Balance="+(balance-withdrawAmount+depositAmount));
	}
}
class demoatm
{
	public static void main(String args[])
	{
	 ATM obj=new ATM();
	 obj.displaycurrentbalance();
	 obj.amountwithdrawing();
	 obj.amountdeposit();
	}
}