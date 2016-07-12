package Sample;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Unordered 
{
public static void main(String[] args) throws IOException
{
	
	 FileReader in = new FileReader("/home/bridgeit/Documents/un");
	 System.out.print("String is: ");
	 BufferedReader br = new BufferedReader(in);
	 String splited[]=new String[4];
	 
	 
	 String str=br.readLine();
	 System.out.println(str);
	    
	    in.close();
	    System.out.println();
	    System.out.println("Splited String:");
	    
	    LinkedList<String> li=new LinkedList();
	    
	    for(int i=0;i<3;i++)
	    {
	    	splited = str.split("\\s+");
	    	
	        System.out.println(splited[i]);
	    
	        li.add(i, splited[i]);
	        
	    }
       

	    
 Scanner sc=new Scanner(System.in);
 System.out.println("\nEnter The word to search");
 String word=sc.nextLine();
 

String t;
 for(int i=0;i<3;i++)
	 {
	  t=(String) li.get(i);
	 
	 if(word.equals(t))
		 {
			 System.out.println("Word is Found");
			 li.remove(word);
			 System.out.println("Word is Remove from the list");
			 break;
			
		 }
	 else
		 {
			     System.out.println("Word is not found");
			     li.add(word);
			     System.out.println("Word is Added to the list");
			     break;
		 }
	 }	 

sc.close();
}
}