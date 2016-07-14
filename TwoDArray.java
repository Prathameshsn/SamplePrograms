package Sample;
import java.util.Scanner;

public class TwoDArray 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	
System.out.println("Choose the Input Type");	/*Taking input from user*/
System.out.println("\nEnter 1 for Integer :");
System.out.println("Enter 2 for Double :");
System.out.println("Enetr 3 for Bollean :");
int i=sc.nextInt();

	switch(i)
	{
	case 1:
		{
			System.out.println("Enter The Number of Column");
			int m=sc.nextInt();
			System.out.println("Enter The Number of Row");
			int n=sc.nextInt();
			System.out.println("Enter Value of m*n");
			int mn=sc.nextInt();
			
			int arr[][]=new int[m][n];    /*2D array Declaration of type int*/
			for(int j=0;j<m;j++)
				{
					for(int k=0;k<n;k++)
					{
						arr[j][k]=mn;
					}
				}
			
			for(int j=0;j<m;j++)
				{
					for(int k=0;k<n;k++)
					{
						System.out.print(arr[j][k]);
					}
					System.out.println();
				}
		}
		
		
	case 2:
		{
			System.out.println("Enter The Number of Column");
			int m=sc.nextInt();
			System.out.println("Enter The Number of Row");
			int n=sc.nextInt();
			System.out.println("Enter Value of m*n");
			double mn=sc.nextInt();
			
			
			Double[][] arr=new Double[m][n]; /*2D array Declaration of type Double*/
			for(int j=0;j<m;j++)
				{
					for(int k=0;k<n;k++)
					{
						arr[j][k]=mn;
					}
				}
			
			for(int j=0;j<m;j++)
				{
					for(int k=0;k<n;k++)
					{
						System.out.print(arr[j][k]);
					}
					System.out.println();
				}
		}
	
	
	case 3:
		{
			System.out.println("Enter The Number of Column");
			int m=sc.nextInt();
			System.out.println("Enter The Number of Row");
			int n=sc.nextInt();
			System.out.println("Enter Value of m*n");
			boolean mn=sc.hasNext();
			
			boolean arr[][]=new boolean[m][n];  /*2D array Declaration of type boolean*/
			for(int j=0;j<m;j++)
				{
					for(int k=0;k<n;k++)
					{
						arr[j][k]=mn;
					}
				}
			
			for(int j=0;j<m;j++)
			{
				for(int k=0;k<n;k++)
				{
					System.out.print(arr[j][k]);
				}
				System.out.println();
			}
		}
	}
	sc.close();
}
}
