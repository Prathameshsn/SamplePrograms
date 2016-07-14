package Sample;
import java.util.Scanner;

public class Stopwatch 
{	
	long t1,t2;
	
	public void startingtime()
		{		
			t1=System.currentTimeMillis();   /*Method for current Time in millisecond*/
			
			System.out.println("Starting Time is: "+t1);
		}

	public void stoptime()
		{
			t2=System.currentTimeMillis();
			System.out.println("Stoping Time is:: "+t2);
		}
	
	public void Escape()
		{
			long T=t2-t1;			 		/*Calculate Elapse Time*/
			System.out.println("\nElapse Time is between Start and End of Stopwatch: "+T);
		}
	
	
public static void main(String[] args) 
	{
		Stopwatch sw=new Stopwatch();
			
		Scanner sc=new Scanner(System.in);
		
		/*taking input from user*/
		System.out.println("Press 1 for Start Time"); 
		sc.next();
		
		sw.startingtime();
		
		/*taking input from user*/
		System.out.println("\nPress 2 for Stop Time");
		sc.next();
		
		sw.stoptime();
		
		sw.Escape();
	}
}