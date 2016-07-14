package Sample;
public class Bubble 
{

public static void main(String[] args) 
	{
	int arr[]={4,2,6,9,4,5,7,3};
	
	/*Pass array to sort method as argument*/
	sort(arr);
	}

public static void sort(int arr[])
{
	int k;
	
	for(int t=0;t<arr.length;t++)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			k=i+1;
			if(arr[i]>arr[k])
			{
				swap(arr,i,k);
			}
		}
	}
}

public static void swap(int arr[],int i,int k)
{

int temp;
temp=arr[i];
arr[i]=arr[k];
arr[k]=temp;

for (int l=0;l<arr.length;l++)
	{
	    System.out.print(arr[l] + ", ");
	}
System.out.println("\n");

}
}
