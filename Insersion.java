package Sample;

public class Insersion 
{
public static void main(String[] args) 
{
	int arr[]={5,4,6,7,2,6,23,9};
	sort(arr);
}

public static void sort(int arr[])
{
    int n = arr.length;
    for (int j = 1; j < n; j++) 
    	{
	        int key=arr[j];
	        int i=j-1;
	        while((i>-1)&&(arr[i]>key))
        {
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=key;
        print(arr);
    	}
}
        

public static void print(int arr[])
	{
		
	for(int t=0;t<arr.length;t++)
		{
			System.out.print(+arr[t]+",");
		}
	System.out.println();
	}
}
