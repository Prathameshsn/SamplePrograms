package Sample;

import java.util.Scanner;


public class Triples 
{
	int count=0,s=0;
public void sum(int arr[])
{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length-1;k++)
				{
					
				if(arr[i]+arr[j]+arr[k]==s)
				{
					count++;
					System.out.println("Triples are: "+arr[i]+arr[j]+arr[k]);
				}
					
				}
			}
		}
}
	

	
public static void main(String[] args) 
{
Triples obj=new Triples();
Scanner sc=new Scanner(System.in);
int arr[]={1,2,1,1,-1,-2,-1,0};
obj.sum(arr);	
}
}

