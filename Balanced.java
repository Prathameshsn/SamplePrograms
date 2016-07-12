package Sample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import javax.sound.midi.Synthesizer;

public class Balanced 
{
public static void main(String[] args) throws IOException 
{
	FileReader fr=new FileReader("/home/bridgeit/Documents/bal");
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	
	Stack st=new Stack();
	st.push(str);
	
	System.out.println(""+str);
	
	
	for(int i=1;i<str.length();i++)
	{
		if(str.charAt(i)=='(')
			{
				st.push(i);
			}
		if(str.charAt(i)==')')
			{
				st.pop();
			}
	}
	System.out.println(st);
	
	
		
}
}
