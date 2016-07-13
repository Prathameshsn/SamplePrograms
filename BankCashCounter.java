package Sample;

import java.util.Scanner;
import Utility.Utility;

public class BankCashCounter 
{
public static void main(String[] args) 
{
	
	Utility obj=new Utility();
	int ip;
	
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter 1 for see Number of people in Queue: ");	
System.out.println("\nEnter 2 for Cash Deposit: ");
System.out.println("Enter 3 for Cash Withdrow: ");

ip=sc.nextInt();

switch(ip)
{
case 2:
	{
		
		System.out.println("Enter the ammount:");
		int amt1=sc.nextInt();
		obj.enqueue(amt1);
		break;
	}

case 3:
	{
	System.out.println("Enter ammount to Withdrow");
	int amt2=sc.nextInt();
	obj.dequeue(amt2);
	
	break;
	}

case 1:
	{
	 System.out.println("Total numbers of people in Queue");
	 int amt3=sc.nextInt();
	
	}
}
}
}
