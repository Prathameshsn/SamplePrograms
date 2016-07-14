package Sample;

import java.util.Scanner;

public class Notes 
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		/*Taking input from user*/
		System.out.println("Ammount: ");
		int amt=sc.nextInt();
		
		Notes obj=new Notes();
		obj.note(amt);
		
	
	}

	int count=0;
	public void note(int num)
	{
	
	if(num>=1000)
		{	
			num=num-1000;
			note(num);
			System.out.println("one 1000 note");
			count++;
		}
	
	else if(num>=500)
		{
		
			num=num-500;
			note(num);
			System.out.println("one 500 note");
			count++;
		}
	
	else if(num>=100)
		{
			
			num=num-100;
			note(num);
			System.out.println("one 100 note");
			count++;
		}
		
	else if(num>=50)
		{
			
			num=num-50;
			note(num);
			System.out.println("one 50 note");
			count++;
		}
	
	else if(num>=20)
		{
		
			num=num-20;
			note(num);
			System.out.println("one 20 note");
			count++;
		}
	
	else if(num>=10)
		{
			
			num=num-10;
			note(num);
			System.out.println("one 10 note");
			count++;
		}
	
	else if(num>=5)
		{
			
			num=num-5;
			note(num);
			System.out.println("one 5 note");
			count++;
		}
	
	else if(num>=2)
		{
			
			num=num-2;
			note(num);
			System.out.println("one 2 note");
			count++;
		}
	
	else if(num>=1)
		{
			
			num=num-1;
			note(num);
			System.out.println("one 1 note");
			count++;
		}
	
	System.out.print("" +count);
	}
	
}
