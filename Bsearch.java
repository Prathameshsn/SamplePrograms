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
word=sc.nextLine();

int start=0,end=arr.length-1,mid;

if(arr[start].equals(word)||arr[end].equals(word))
	{
	System.out.println("word is found");	
	}
else
mid=start+end/2;



}
}