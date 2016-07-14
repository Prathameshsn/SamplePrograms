package Sample;
import java.util.Scanner;

public class Simple
{
public static void main(String args[])
	{
		String in;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter is your name ");
		in=sc.nextLine();
		
		
		System.out.print("Hello "+in);
		System.out.println(", How are you..");
	
	}
}
