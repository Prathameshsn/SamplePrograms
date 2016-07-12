package Sample;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Ordered 
{
public static void main(String[] args) throws IOException 
{
	LinkedList li=new LinkedList();	

	FileReader fr=new FileReader("/home/bridgeit/Documents/ol");
	BufferedReader br=new BufferedReader(fr);

	String arr[]=new String[]{br.readLine()};

	li.add(0,arr[0]);
	
	System.out.println("Original List: "+li);
	
		for(int i=0;i<arr.length;i++)
			{
				li.add(i,arr[i]);
			}
		

	System.out.println("Original List: ");
	sort(li);
	System.out.println("Sorted List: ");

}

public static void sort(LinkedList li)
	{
		
		for(int i=0;i<li.size();i++)
		{
			
			{
				
			}
			
		}
	}
}
