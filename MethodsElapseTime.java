package Sample;
import java.util.Scanner;

import Utility.Utility1;

public class MethodsElapseTime
{
	
public static void main(String[] args) 
{
	long time;
	
	Scanner sc=new Scanner(System.in);
	Utility1 obj=new Utility1();
	
	long ctime=System.currentTimeMillis();
	
	for(int i=0;i<7;i++)
	{
	System.out.println("\nPress 1 for Binray Search of type Int:");
	System.out.println("Press 2 for Binray Search of type String:");
	System.out.println("Press 3 for Insersion sort of type Int:");
	System.out.println("Press 4 for Insertion sort Search of type String:");
	System.out.println("Press 5 for Bubble sort of type Int:");
	System.out.println("Press 6 for Bubble sort of type String\n");
	int num=sc.nextInt();
	
	
	int arr[]={2,3,1,4,6,8,5};
	String arr1[]={"prathamesh"};
	
	
	
	switch(num)
	{
	case 1:
		{
			obj.binarySearch(arr, 0);
			time=System.currentTimeMillis();
			long etime1=time-ctime;
			System.out.println("Elapse Time is: "+etime1);
			break;
		}
	
	case 2:
		{
			obj.binarySearch(arr1, 0);
			time=System.currentTimeMillis();
			long etime2=time-ctime;
			System.out.println("Elapse Time is: "+etime2);
			break;
		}
		
	case 3:
		{
			obj.insertionSort(arr);
			time=System.currentTimeMillis();
			long etime3=time-ctime;
			System.out.println("Elapse Time is: "+etime3);
			break;
		}
		
	case 4:
		{
			obj.insertionSort(arr1);
			time=System.currentTimeMillis();
			long etime4=time-ctime;
			System.out.println("Elapse Time is: "+etime4);
			break;
		}
	
	case 5:
		{
			obj.bubbleSort(arr);
			time=System.currentTimeMillis();
			long etime5=time-ctime;
			System.out.println("Elapse Time is: "+etime5);
			break;
		}
	
	case 6:
		{
			obj.bubbleSort(arr1);
			time=System.currentTimeMillis();
			long etime6=time-ctime;
			System.out.println("Elapse Time is: "+etime6);
			break;
		}
	}
	}
}
}
