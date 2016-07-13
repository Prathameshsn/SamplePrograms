package Sample;
import java.util.Scanner;
import Utility.Utility;

public class Palindrom 
{
public static void main(String[] args) 
{
Utility obj=new Utility();
	
Scanner sc=new Scanner(System.in);

System.out.println("Enter The String:");
String str=sc.nextLine();

obj.Palindrom(str);

}

}
