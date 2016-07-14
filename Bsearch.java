package Sample;
import java.util.Scanner;

public class Bsearch 
{
public static void main(String[] args) 
	{
		String word;
		String arr[]=new String[]{"abc","xyz","pqr","a","b","c"};
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word to seach");
		word=sc.nextLine();                         /*Taking word from user as a input*/
		
		int start=0,end=arr.length-1,mid;
		
		if(arr[start].equals(word)||arr[end].equals(word))    /*Compare word with Array*/
			{
			System.out.println("word is found");	
			}
		else
		mid=start+end/2;
	}

}