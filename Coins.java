package Sample;
import java.util.Scanner;

public class Coins 

{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);	

int flip;
double ch;
int t=0,h=0;
float tail,head;

System.out.println("Enter the number of time Coin toss");
flip=sc.nextInt();

	for(int i=0;i<flip;i++)
	{
		ch=Math.random();
		
		if(ch<0.5)
			{
				++t;
			}
		else
			{
				++h;
			}
		
	}
	tail=(t*100)/flip;
	System.out.println("Percentage of Tail is = "+tail);
	
	head=(h*100)/flip;
	System.out.println("Percentage of Head is = "+head);
	
	sc.close();
}
}

