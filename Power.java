package Sample;
import java.util.Scanner;

public class Power 
{
public static void main(String args[])
{
	int num,n1,p=1;
	int power=2;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number"); 
	num=sc.nextInt();
	
	System.out.println("Table of Powers of 2");
	
	
	for(int i=1;i<num;i++)
	{
		power=power*2;
	}
	
		for(int i=0;i<power;i++)
		{
		p=p*2;	
		System.out.println(""+p);
		}
}

}
