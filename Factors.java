package Sample;

public class Factors 
{
public static void main(String[] args) 
{
int num=10;
int no1;

System.out.println("Factors of Number are ");

for(int i=2;i<=10;)
	{
	if(num%i==0)
		{
			System.out.println(""+i);
			no1=num/i;
			num=no1;
		}
		
	else
		{
			
			++i;
			if(num%i==0)
			{
				System.out.print("");
			}
			
			
		}
	}
}
	
}
