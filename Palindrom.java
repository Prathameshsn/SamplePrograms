package Sample;
import java.util.Scanner;

public class Palindrom 
{
public static void main(String[] args) 
{
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String:");
String str=sc.nextLine();

String org; 
String rev="";

org=str;

for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}

if(org.equals(rev))
	{
		System.out.println("String are Palindrom");
	}
else
		System.out.println("String are not Palindrom");
}

}
