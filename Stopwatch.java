package Sample;
import java.util.Scanner;

public class Stopwatch 
{
	long s1=0;
	long s2=0;
	
	public void startingtime()
	{
		
		s1=System.currentTimeMillis();
		System.out.println("Starting Time is: "+s1);
	}

	public void stoptime()
	{
		
		s2=System.currentTimeMillis();
		System.out.println("Stoping Time is:: "+s2);
	}
	
	public void Escape()
	{
		long T=s2-s1;
		System.out.println("\nElapse Time is between Start and end of Stopwatch: "+T);
	}
	
public static void main(String[] args) 
{
Stopwatch sw=new Stopwatch();
	
Scanner sc=new Scanner(System.in);
int st,et;

System.out.println("Enter starting time");
st=sc.nextInt();

System.out.println("Enter Ending time");
et=sc.nextInt();

sw.startingtime();
sw.stoptime();
sw.Escape();
}
}
