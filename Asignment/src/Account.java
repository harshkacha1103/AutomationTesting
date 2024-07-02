//W.A.J.P. to create a custom exception if Customer withdraw amount
//which is greater than account balance then program will show custom
//exception otherwise amount will deduct from account balance.
//Account balance is:2000 Enter withdraw
//amount:2500
//Sorry, insufficient balance, you need more 500 Rs.To perform
//this transaction.



import java.util.Scanner;




class InsufficientException extends Exception
 {
 double balance;
 double wbalance;
 public InsufficientException(String msg)
 {
 super(msg);
 
 }
 
  
 void withdraw()
 {
 double balance = 2000;//25000
 System.out.println("Current Balance: "+balance);
 
 try
 {
       System.out.print("Enter withdraw amount: "); 
       Scanner in=new Scanner(System.in);
       double wamount=in.nextDouble();
       if(wamount>balance)
 {
    	   throw new InsufficientException("Insufficient balance in account.....");
 }
       
       
 else
	 System.out.println("Transaction Successfully Completed......");
       double rembal = balance-wamount;
       System.out.println("Withdrawal Amount :"+wamount);
       System.out.println("After transaction current balance : " + rembal);
 }
 
 catch(InsufficientException e)
 	{
	 System.out.println("Caught:"+e.getMessage());
 	}
 }
}


public class Account 
{
	public static void main(String[] args) 
	{
		 InsufficientException se=new InsufficientException("Insufficient balance in account");
		 se.withdraw();
	}

}
