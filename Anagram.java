package Sample;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
public void check(String a,String b)
	{
	
	boolean b1=true;
	
	if(a.length()!=b.length())         /*Comparing Length of String*/
	{
		b1=false;
		System.out.println("String is not Anagram");
	}
	else
	{
		char arr1[]=a.toLowerCase().toCharArray();
		char arr2[]=b.toLowerCase().toCharArray();
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		b1=Arrays.equals(arr1,arr2);
		
		System.out.println("\n");
		if(b1==true)
			{
				System.out.println("Strings are Anagram");
			}
		else
			{
				System.out.println("Strings is not Anagram");
			}
		
	}
	}
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Anagram obj=new Anagram();
		
		System.out.println("Enter 1st String:");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd String:");
	    String s2=sc.nextLine();
	    
	    
	    
	    obj.check(s1, s2);
	    sc.close();
	}


}
