package Sample;
import java.util.Scanner;

public class Coins 
{

public static void main(String[] args) 
{
	
int flip;
double ch;
int t=0,h=0;
float tail,head;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of time Coin toss");
flip=sc.nextInt();

	for(int i=0;i<flip;i++)
	{
		ch=Math.random();                   /*Method for take Random Number*/
		
		if(ch<0.5)
			{
				++t;
			}
		else
			{
				++h;
			}
		
	}
	/*Calculate Percentage*/
	tail=(t*100)/flip;									
	System.out.println("Percentage of Tail is = "+tail);
	
	/*Calculate Percentage*/
	head=(h*100)/flip;
	System.out.println("Percentage of Head is = "+head);
	
	sc.close();
}
}

