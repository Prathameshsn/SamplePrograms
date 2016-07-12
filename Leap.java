package Sample;
import java.util.Scanner;

public class Leap
{
	public static void main(String[] args) 
{
		
int year;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year");
year=sc.nextInt();

if(year%2==0 && year%100!=0)
	{
	System.out.println("This year is leap year");	
	}
else
	System.out.println("This year is not a leap year");
}
}
