package Sample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Balanced 
{
public static void main(String[] args) throws IOException 
{
	FileReader fr=new FileReader("/home/bridgeit/Documents/bal");
	BufferedReader br=new BufferedReader(fr);
	
	String str=br.readLine();
	Stack st=new Stack();
	System.out.println(""+str);
	
		
}
}
