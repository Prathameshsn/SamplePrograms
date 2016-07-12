package Sample;

public class Triples 
{
	
public static void main(String[] args) 
{
int arr1[]=new int[25];
int arr2[]=new int[25];
int arr3[]=new int[25];


for(int a=-9;a>-10 && a<10;a++)
{
	for(int b=0;b<=20;b++)
	{
		arr1[b]=a;
		arr2[b]=a;
		arr3[b]=a;
	}
	
}


	for(int i=0;i<=20;i++) 
	{
		for(int j=0;j<=20;j++)
		{
			for(int k=0;k<=20;k++)
			{
				if(arr1[i] + arr2[j] + arr3[k]==0)
				System.out.println("Triples are"+i+j+k);
			}
		}
		
	}

}
}
